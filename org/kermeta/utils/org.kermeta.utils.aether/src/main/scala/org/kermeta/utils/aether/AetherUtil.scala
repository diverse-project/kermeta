package org.kermeta.utils.aether

/**
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.sonatype.aether.{ConfigurationProperties, RepositorySystem}
import org.apache.maven.repository.internal.DefaultServiceLocator
import org.sonatype.aether.connector.file.FileRepositoryConnectorFactory
import org.sonatype.aether.connector.async.AsyncRepositoryConnectorFactory
import org.sonatype.aether.impl.internal.EnhancedLocalRepositoryManagerFactory
import org.sonatype.aether.resolution.ArtifactRequest
import org.sonatype.aether.resolution.ArtifactResult
import org.sonatype.aether.spi.connector.RepositoryConnectorFactory
import org.sonatype.aether.spi.localrepo.LocalRepositoryManagerFactory
import org.sonatype.aether.util.artifact.DefaultArtifact
import org.apache.maven.repository.internal.MavenRepositorySystemSession
import java.io.File
import org.sonatype.aether.repository.{RepositoryPolicy, RemoteRepository, LocalRepository}
import org.sonatype.aether.artifact.Artifact
import scala.collection.JavaConversions._
import org.sonatype.aether.transfer.{TransferEvent, TransferListener}
import java.net.MalformedURLException
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem
import org.kermeta.utils.systemservices.api.impl.StdioSimpleMessagingSystem


/**
 * User: ffouquet
 * Date: 25/07/11
 * Time: 15:06
 */

class AetherUtil(val messagingSystem : MessagingSystem, val baseMsgGroup : String ) {

  def this() = this(new StdioSimpleMessagingSystem(),"")
  
  
  
  val newRepositorySystem: RepositorySystem = {
    val locator = new DefaultServiceLocator()    
    locator.addService(classOf[LocalRepositoryManagerFactory], classOf[EnhancedLocalRepositoryManagerFactory])
    locator.addService(classOf[RepositoryConnectorFactory], classOf[FileRepositoryConnectorFactory])
    locator.addService(classOf[RepositoryConnectorFactory], classOf[AsyncRepositoryConnectorFactory])
   // locator.addService(classOf[RepositoryConnectorFactory], classOf[WagonRepositoryConnectorFactory] )

    locator.getService(classOf[RepositorySystem])
  }
  
  
  def resolveMavenArtifact(mavenurl: String, repositoriesUrl: List[String]): File = {
    
    var file: File = null
    if (mavenurl.startsWith("mvn:")) {
    	val url = mavenurl.substring(4)
    	if (url.startsWith("http://")) {
    		val repourl = url.substring(0, url.indexOf("!"))
    		val urlids = url.substring(url.indexOf("!") + 1)
    		val part = urlids.split("/")
    		if (part.size == 3) {
    			file = resolveMavenArtifact(part(1), part(0), part(2), List(repourl))
    		} else { 
    			throw new MalformedURLException("Bad MVN URL <mvn:[repourl!]groupID/artefactID/version>")
    		}
    	}
    	if (file == null) {
        val part = mavenurl.split("/")
        if (part.size == 3) {
          file = resolveMavenArtifact(part(1), part(0), part(2), repositoriesUrl)
        } else {
    		throw new MalformedURLException("Bad MVN URL <mvn:[repourl!]groupID/artefactID/version>")
        }
      }
    }
    file
  }
  
  def resolveMavenArtifact4J(unitName: String, groupName: String, version: String, repositoriesUrl: java.util.List[String]): File =
    resolveMavenArtifact(unitName, groupName, version, repositoriesUrl.toList)
  
  def resolveMavenArtifact(unitName: String, groupName: String, version: String, repoURL: String): File = {    
    val repositoriesUrl :List[String] = List(repoURL)
    resolveMavenArtifact(unitName, groupName, version, repositoriesUrl)
  }
  
  def resolveMavenArtifact(groupID: String, artifactID: String, version: String, repositoriesUrl: List[String]): File = {
    val artifact: Artifact = new DefaultArtifact(List(groupID, artifactID, version).mkString(":"))
    val artifactRequest = new ArtifactRequest
    artifactRequest.setArtifact(artifact)

    val repositories: java.util.List[RemoteRepository] = new java.util.ArrayList();
    
    repositoriesUrl.foreach {
      repoURL =>
	      val repo = new RemoteRepository
	      repo.setId(repoURL.trim.replace("http://","").replace(':', '_').replace('/', '_').replace('\\', '_'))
	      //repo.setUrl(repoURL.trim.replace(':', '_').replace('/', '_').replace('\\', '_'))
	      repo.setUrl(repoURL)
	      repo.setContentType("default")
	      val repositoryPolicy = new RepositoryPolicy()
	      repositoryPolicy.setChecksumPolicy(RepositoryPolicy.CHECKSUM_POLICY_WARN)
	      repositoryPolicy.setUpdatePolicy(RepositoryPolicy.UPDATE_POLICY_ALWAYS)
	      repo.setPolicy(true, repositoryPolicy)
	      repositories.add(repo)
    }


    artifactRequest.setRepositories(repositories)
    var artefactResult: ArtifactResult = null;
    artefactResult = newRepositorySystem.resolveArtifact(newRepositorySystemSession, artifactRequest)
    artefactResult.getArtifact.getFile
  }

  val newRepositorySystemSession = {
    val session = new MavenRepositorySystemSession()
    session.setTransferListener(new TransferListener(){
      def transferInitiated(p1: TransferEvent) {
        messagingSystem.debug("Transfert init for Artifact "+p1.getResource.getResourceName, baseMsgGroup)
      }

      def transferStarted(p1: TransferEvent) {
        messagingSystem.debug("Transfert begin for Artifact "+p1.getResource.getResourceName, baseMsgGroup)
      }

      def transferProgressed(p1: TransferEvent) {
        messagingSystem.debug("Transfert in progress for Artifact "+p1.getResource.getResourceName, baseMsgGroup)
      }

      def transferCorrupted(p1: TransferEvent) {
        messagingSystem.error("TransfertCorrupted : "+p1.getResource.getResourceName, baseMsgGroup)
      }

      def transferSucceeded(p1: TransferEvent) {
        messagingSystem.debug("Transfert succeeded for Artifact "+p1.getResource.getResourceName, baseMsgGroup)
      }

      def transferFailed(p1: TransferEvent) {
        messagingSystem.error("TransferFailed : "+p1.getResource.getResourceName, baseMsgGroup)
      }
    })
    session.setUpdatePolicy(RepositoryPolicy.UPDATE_POLICY_ALWAYS)
    session.setConfigProperty("aether.connector.ahc.provider", "jdk")
    session.setLocalRepositoryManager(newRepositorySystem.newLocalRepositoryManager(new LocalRepository(System.getProperty("user.home").toString + "/.m2/repository")))
    //TRY TO FOUND MAVEN CONFIGURATION
    val configFile = new File(System.getProperty("user.home").toString + File.separator + ".m2" + File.separator + "settings.xml")
    if (configFile.exists()) {
      val configRoot = scala.xml.XML.loadFile(configFile)
      configRoot.child.find(c => c.label == "localRepository").map {
        localRepo =>
          //logger.info("Found localRepository value from settings.xml in user path => " + localRepo.text)
          session.setLocalRepositoryManager(newRepositorySystem.newLocalRepositoryManager(new LocalRepository(localRepo.text)))
      }
    } /*else {
      logger.debug("settings.xml not found")
    }*/
    session.getConfigProperties.put(ConfigurationProperties.REQUEST_TIMEOUT, 2000.asInstanceOf[java.lang.Integer])
    session.getConfigProperties.put(ConfigurationProperties.CONNECT_TIMEOUT, 1000.asInstanceOf[java.lang.Integer])
    session
  }

}

object AetherUtil{}
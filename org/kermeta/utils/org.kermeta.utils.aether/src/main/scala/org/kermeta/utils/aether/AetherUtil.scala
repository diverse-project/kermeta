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

import org.sonatype.aether.RepositorySystem
import org.apache.maven.repository.internal.DefaultServiceLocator
import org.sonatype.aether.spi.connector.RepositoryConnectorFactory
import org.sonatype.aether.connector.file.FileRepositoryConnectorFactory
import org.sonatype.aether.connector.async.AsyncRepositoryConnectorFactory
import org.sonatype.aether.resolution.ArtifactRequest
import org.sonatype.aether.resolution.ArtifactResult
import org.sonatype.aether.util.artifact.DefaultArtifact
import org.apache.maven.repository.internal.MavenRepositorySystemSession
import java.io.File
import org.sonatype.aether.repository.{RepositoryPolicy, RemoteRepository, LocalRepository}
import org.sonatype.aether.artifact.Artifact
import scala.collection.JavaConversions._

/**
 * User: ffouquet
 * Date: 25/07/11
 * Time: 15:06
 */

object AetherUtil {

	def main(args: Array[String]) {
      println("Hello, world!")
    }

  val newRepositorySystem: RepositorySystem = {
    val locator = new DefaultServiceLocator()
    locator.addService(classOf[RepositoryConnectorFactory], classOf[FileRepositoryConnectorFactory])
    locator.addService(classOf[RepositoryConnectorFactory], classOf[AsyncRepositoryConnectorFactory])
    locator.getService(classOf[RepositorySystem])
  }

  def resolveDeployUnit(groupID: String, artifactID: String, version: String, repoURL: String): File = {
   
    var artifact: Artifact = new DefaultArtifact(List(groupID, artifactID, version).mkString(":"))

    println("coucou");
    
    val artifactRequest = new ArtifactRequest
    artifactRequest.setArtifact(artifact)

    println("coucou1");
    
    val repositories: java.util.List[RemoteRepository] = new java.util.ArrayList();
    if (repoURL != null) {
        val repo = new RemoteRepository
        repo.setId(repoURL)
        repo.setUrl(repoURL)
        val repositoryPolicy = new RepositoryPolicy()
        repositoryPolicy.setChecksumPolicy(RepositoryPolicy.CHECKSUM_POLICY_WARN)
        repositoryPolicy.setUpdatePolicy(RepositoryPolicy.UPDATE_POLICY_ALWAYS)
        repo.setPolicy(true, repositoryPolicy)
        repositories.add(repo)
    }

    println("coucou2");
    
    artifactRequest.setRepositories(repositories)
    
    println("coucou3");
   	var artefactResult : ArtifactResult = null;
   	try {
   	  artefactResult = newRepositorySystem.resolveArtifact(newRepositorySystemSession, artifactRequest)
   	} catch {
   	  case r:Exception => println("Exception:"+ r.getStackTraceString);
   	}
    println("coucou4");
    artefactResult.getArtifact.getFile
  }

  val newRepositorySystemSession = {
    println("coucou5");
    val session = new MavenRepositorySystemSession()
    /*
   val factory = new DefaultSettingsBuilderFactory
   val settingBuilder = factory.newInstance()
   val settingBuilderRequest = new DefaultSettingsBuildingRequest
   val settingResult = settingBuilder.build(settingBuilderRequest)

   println(settingResult.getEffectiveSettings.getProfiles.size())
    */
    session.setLocalRepositoryManager(newRepositorySystem.newLocalRepositoryManager(new LocalRepository(System.getProperty("user.home").toString + "/.m2/repository")))
    session
  }

}
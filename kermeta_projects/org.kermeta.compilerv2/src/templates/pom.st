<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>fr.irisa.triskell</groupId>
    <artifactId>kermeta.compilo.scala.output</artifactId>
    <name>fr.irisa.triskell.kermeta.compilo.scala.output</name>
    <version>0.0.1-SNAPSHOT</version>
    <description>Kermeta Compiler Output </description>
    <packaging>bundle</packaging>

    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <scala.version>2.8.0.Beta1</scala.version>
    </properties>

    <repositories>
        <repository>
            <id>thirdparty</id>
            <name>Irisa Tipimouss Nexus ThirdParty</name>
            <url>http://tipimouss.irisa.fr:8081/nexus/content/repositories/thirdparty</url>
        </repository>
        <repository>
            <id>scala-tools.org</id>
            <name>Scala-tools Maven2 Repository</name>
            <url>http://scala-tools.org/repo-releases</url>
        </repository>
        <repository>
            <id>triskellPublic</id>
            <url>http://tipimouss.irisa.fr:8081/nexus/content/groups/public</url>
        </repository>
    </repositories>

    <pluginRepositories>
        <pluginRepository>
            <id>scala-tools.org</id>
            <name>Scala-tools Maven2 Repository</name>
            <url>http://scala-tools.org/repo-releases</url>
        </pluginRepository>
    </pluginRepositories>




    <build>
        <sourceDirectory>src</sourceDirectory>
        <resources>
            <resource>
                <directory>resources</directory>
            </resource>
        </resources>
        <!-- <testSourceDirectory>src/test/scala</testSourceDirectory> -->
        <plugins>
            <plugin>
                <groupId>org.scala-tools</groupId>
                <artifactId>maven-scala-plugin</artifactId>
                <executions>
                    <execution>
                        <phase>process-resources</phase> <!-- to support mix java/scala only -->
                        <goals>
                            <goal>add-source</goal>      <!-- to support mix java/scala only -->
                            <goal>compile</goal>
                            <goal>testCompile</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <scalaVersion>\${scala.version}</scalaVersion>
                    <args>
                        <arg>-target:jvm-1.5</arg>
                        <arg>-make:transitivenocp</arg>
                        <arg>-dependencyfile</arg>
                        <arg>\${project.build.directory}/.scala_dependencies</arg>
                    </args>
                    <launchers>
					<launcher>
							<id>runner.MainRunner</id>
							<mainClass>runner.MainRunner</mainClass>
							<!-- jvmArgs are optional -->
						<jvmArgs>
							<jvmArg>-Xmx512m</jvmArg>
							</jvmArgs>
					</launcher>
					</launchers>
					<jvmArgs>
							<jvmArg>-Xmx1024m</jvmArg>
					</jvmArgs>                
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <configuration>
                    <source>1.5</source>
                    <target>1.5</target>
                </configuration>
            </plugin>

		<plugin>
		<groupId>org.codehaus.mojo</groupId>
		<artifactId>truezip-maven-plugin</artifactId>
		<version>1.0-beta-4</version>
		<executions>
		  <execution>
		    <id>remove-a-file</id>
		    <goals>
		      <goal>remove</goal>
		    </goals>
		    <phase>package</phase>
		    <configuration>
		      <fileset>
		        <directory>target/\${project.artifactId}-\${project.version}.jar/META-INF</directory>
		        <includes>
		          <include>**/*.RSA</include>
			   <include>**/*.SF</include>
		        </includes>
		      </fileset>
		    </configuration>
		  </execution>
		</executions>
	      </plugin>
	      
            <plugin>
                <groupId>org.apache.felix</groupId>
                <artifactId>maven-bundle-plugin</artifactId>
                <extensions>true</extensions>
                <configuration>
                    <instructions>
                        <Private-Package>*</Private-Package>
                        <Bundle-ClassPath>.</Bundle-ClassPath>
                    </instructions>
                </configuration>
            </plugin>

        </plugins>

    </build>
    <dependencies>
        <dependency>
            <groupId>fr.irisa.triskell</groupId>
            <artifactId>kermeta.model</artifactId>
            <version>1.3.0</version>
        </dependency>
        <dependency>
            <groupId>fr.irisa.triskell</groupId>
            <artifactId>kermeta.emf</artifactId>
            <version>2.5.0</version>
        </dependency>
        <dependency>
            <groupId>fr.irisa.triskell</groupId>
            <artifactId>kermeta.emf.common</artifactId>
            <version>2.5.0</version>
        </dependency>
        <dependency>
            <groupId>fr.irisa.triskell</groupId>
            <artifactId>kermeta.emf.ecore</artifactId>
            <version>2.5.0</version>
        </dependency>
        <dependency>
            <groupId>fr.irisa.triskell</groupId>
            <artifactId>kermeta.emf.ecore.xmi</artifactId>
            <version>2.5.0</version>
        </dependency>
        <dependency>
            <groupId>fr.irisa.triskell</groupId>
            <artifactId>kermeta.scala.loader</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>org.scala-lang</groupId>
            <artifactId>scala-library</artifactId>
            <version>2.8.0.Beta1</version>
            <type>jar</type>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>fr.irisa.triskell</groupId>
            <artifactId>kermeta.scala.framework</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <scope>compile</scope>
        </dependency>
    </dependencies>
    <distributionManagement>
        <snapshotRepository>
            <id>nexus</id>
            <url>http://tipimouss.irisa.fr:8081/nexus/content/repositories/snapshots</url>
        </snapshotRepository>
    </distributionManagement>
</project>





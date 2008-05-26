This plugin is used to hold the log4j jar
A bug in eclipse prevents from correctly exporting both the java 
classes of the log4j.jar and classes of this plugin. This occurs when this plugin is deployed
and whena user try to develop a plugin relying on it. Only the latest classpath (in plugin.xml>runtime>classpath)
is correctly visible
Note that it works correctly if both plugin are in development mode, or both are deployed ...

to workaround this issue, we use the customBuildCallback in order to unzip log4j

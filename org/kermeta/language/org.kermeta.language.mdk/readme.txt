You are able to deploy the externs of this MDK in compiled mode by using the parameter "unzip_externs" in your properties file:
unzip_externs = platform:/resource/org.kermeta.language.mdk/externs_language_mdk.zip;util

If you change or add something in the src/java/compiler_externs folder,
please run the ANT file org.kermeta.language.mdk/externs_language_mdk_zip_build.xml and
Refresh the project to update the deployable externs.
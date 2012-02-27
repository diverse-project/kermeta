<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"    
                xmlns:sbhl="java:net.sf.xslthl.ConnectorSaxonB"
                version='1.0'
                xmlns:xslthl="http://xslthl.sf.net"
                extension-element-prefixes="sbhl xslthl">
                <!-- exclude-result-prefixes="xslthl">
    			<!- -xmlns:xslthl="http://xslthl.sf.net"
    			extension-element-prefixes="s6hl xslthl">-->
                  

  <xsl:import href="urn:docbkx:stylesheet"/>
  <xsl:import href="urn:docbkx:stylesheet/highlight.xsl"/>
  <!--  <xsl:import href="urn:docbkx:stylesheet"/>
	<xsl:include href="./common.xsl"/>
	<xsl:include href="./highlight.xsl"/>
	<xsl:param name="highlight.xslthl.config">file:////C:/Users/dvojtise/workspaces/kermetaV2_scala/org.kermeta.language.documentation/src/docbkx/custom/highlighters/xslthl-config.xml</xsl:param>
  -->
  
<xsl:param name="table.borders.with.css" select="1"/>
<xsl:param name="html.stylesheet">css/docbook.css</xsl:param>
<xsl:param name="html.stylesheet.type">text/css</xsl:param>        
<xsl:param name="section.label.includes.component.label" select="1" />         
<xsl:param name="section.autolabel" select="1" />
<xsl:param name="generate.toc">book toc,title,figure</xsl:param>         
<xsl:param name="make.graphic.viewport" select="0"/>
<xsl:param name="callout.graphics" select="1" />
<xsl:param name="callout.graphics.path">gfx/callouts/</xsl:param>
<xsl:param name="callout.graphics.extension">.gif</xsl:param>
<xsl:param name="admon.graphics" select="1"/>
<xsl:param name="admon.graphics.path">gfx/admonitions/</xsl:param>
<xsl:param name="admon.graphics.extension">.gif</xsl:param>
<xsl:param name="admonition.title.properties">text-align: left</xsl:param>
<!-- <xsl:param name="chunk.section.depth" select="0"/>
<xsl:param name="chunk.first.sections" select="1"/>-->

<xsl:param name="chunker.output.encoding">utf-8</xsl:param>

<xsl:param name="formal.title.placement">
figure after
example after
equation after
table after
procedure after
task after
</xsl:param>
           
<!-- support for highlighting . see docbook/xsl/html/highlight.xsl for sample of coloration for html document-->
<xsl:param name="highlight.source" select="1"/>


<xsl:template match="xslthl:comment">
    <i class="hl-comment"><xsl:apply-templates/></i>
</xsl:template>
<xsl:template match="xslthl:multiline-comment">
    <i class="hl-comment"><xsl:apply-templates/></i>
</xsl:template>  
<xsl:template match="xslthl:oneline-comment">
    <i class="hl-comment"><xsl:apply-templates/></i>
</xsl:template> 
  
<xsl:template match='xslthl:keyword'>
  <b class="hl-keyword" style="color:darkblue"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:filekeyword'> 
  <b class="hl-keyword" style="color: darkred"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:annotation'> 
  <b class="hl-keyword" style="color: darkred"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:specialoperation'> 
  <i class="hl-keyword" ><xsl:apply-templates/></i>
</xsl:template>

<xsl:template match='xslthl:string'>
  <i style="color:blue" class="hl-string"><xsl:apply-templates/></i>
</xsl:template>
<xsl:template match='xslthl:comment'>
  <i class="hl-comment" style="color: darkgreen"><xsl:apply-templates/></i>
</xsl:template>
<xsl:template match='xslthl:doccomment'>
  <i class="hl-comment" style="color: darkblue"><xsl:apply-templates/></i>
</xsl:template>

</xsl:stylesheet>

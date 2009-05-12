<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version='1.0'
                xmlns:s6hl="java:net.sf.xslthl.ConnectorSaxon6"
    			xmlns:xslthl="http://xslthl.sf.net"
    			extension-element-prefixes="s6hl xslthl">
               <!--  xmlns:xslthl="http://xslthl.sf.net"
                exclude-result-prefixes="xslthl"> --> 

<!-- not overwritten templates will be copied out  -->
<xsl:template match="a/@*|img/@*|xslthl:number/@*|a|img|xslthl:number">
  <xsl:copy>
    <xsl:apply-templates select="@*|node()"/>
  </xsl:copy>
</xsl:template>
<!-- common base for all html based presentations -->
           
<!-- support for highlighting . see docbook/xsl/html/highlight.xsl for sample of coloration for html document-->
<xsl:param name="highlight.source" select="1"/>
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

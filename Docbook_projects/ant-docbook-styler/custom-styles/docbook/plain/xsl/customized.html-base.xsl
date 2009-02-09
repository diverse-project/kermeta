<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version='1.0'
                xmlns:xslthl="http://xslthl.sf.net"
                exclude-result-prefixes="xslthl"> 

<!-- common base for all html based presentations -->
           
<!-- support for highlighting . see docbook/xsl/html/highlight.xsl for sample of coloration for html document-->
<xsl:param name="highlight.source" select="1"/>
<xsl:template match='xslthl:keyword'>
  <b class="hl-keyword" style="color:darkblue"><xsl:apply-templates/></b>
</xsl:template>
<xsl:template match='xslthl:filekeyword'> 
  <b class="hl-keyword" style="color: darkred"><xsl:apply-templates/></b>
</xsl:template>

<xsl:template match='xslthl:string'>
  <i style="color:blue" class="hl-string"><xsl:apply-templates/></i>
</xsl:template>
<xsl:template match='xslthl:comment'>
  <i class="hl-comment" style="color: darkgrey"><xsl:apply-templates/></i>
</xsl:template>


</xsl:stylesheet>

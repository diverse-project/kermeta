<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                version='1.0'>

<!-- (MM 20040303) The ant filter token @ant.docbook.styler.dir@ will be 
     replaced with the installation directory of the styler. 
     It has to be set in your project's build.xml
     Example:
     
     <property name="ant.docbook.styler.dir" value="/java/ant-docbook-styler" />
     
     On a windows box, this would resolve e.g. to: "c:/java/ant-docbook-styler"
-->
<xsl:import href="@ant.docbook.styler.fileuri@/website/xsl/chunk-tabular.xsl"/>


<xsl:template name="home.navhead">
</xsl:template>

<xsl:template name="home.navhead.upperright">
</xsl:template>

<xsl:template name="home.navhead.separator">
</xsl:template> 

<xsl:param name="admon.graphics" select="1"/>
<xsl:param name="admon.graphics.path">graphics/</xsl:param>
<xsl:param name="admon.graphics.extension">.gif</xsl:param>

<!-- put your customizations here -->

<xsl:param name="nav.icon.style">triangle</xsl:param>
<xsl:param name="html.stylesheet">plain.css</xsl:param>
<xsl:param name="header.hr">0</xsl:param>
<xsl:param name="footer.hr">0</xsl:param>

<xsl:attribute-set name="table.navigation.cell.properties">
  <xsl:attribute name="valign">top</xsl:attribute>
  <xsl:attribute name="align">left</xsl:attribute> 
  <xsl:attribute name="class">toc</xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="table.properties">
  <xsl:attribute name="border">0</xsl:attribute>
  <xsl:attribute name="cellpadding">0</xsl:attribute>
  <xsl:attribute name="cellspacing">0</xsl:attribute>
  <xsl:attribute name="width">100%</xsl:attribute>
  <xsl:attribute name="height">100%</xsl:attribute>
</xsl:attribute-set>
 

</xsl:stylesheet>

<?xml version='1.0'?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:fo="http://www.w3.org/1999/XSL/Format"
                version='1.0'>


<xsl:import href="@ant.docbook.styler.fileuri@/docbook/xsl/fo/docbook.xsl" />
<xsl:import href="@docbook.style.fileuri@/xsl/customized.fo-base.xsl" />

<xsl:param name="xep.extensions" select="1" />

<!-- should be 200a, but fop does not support it. -->
<xsl:param name="ulink.hyphenate">&#xad;</xsl:param>
 
</xsl:stylesheet>


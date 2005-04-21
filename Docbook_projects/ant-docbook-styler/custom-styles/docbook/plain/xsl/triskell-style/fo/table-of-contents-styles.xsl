<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
				xmlns:fo="http://www.w3.org/1999/XSL/Format"
				version="1.0">

<!-- Toc --> 

<xsl:param name="toc.section.depth">3</xsl:param>


<!-- Toc Title -->
<xsl:attribute-set name="toc.title.properties">
	<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	<xsl:attribute name="font-weight">bold</xsl:attribute>   
    <xsl:attribute name="font-style">normal</xsl:attribute>
	<xsl:attribute name="color"><xsl:value-of select="$title.color" /></xsl:attribute>
    <xsl:attribute name="font-size">28pt</xsl:attribute>
  	<xsl:attribute name="text-align">right</xsl:attribute>   
	<xsl:attribute name="space-before">40pt</xsl:attribute>
  	<xsl:attribute name="space-after">30pt</xsl:attribute>
</xsl:attribute-set>


<xsl:template name="table.of.contents.titlepage" priority="1">
  <fo:block xsl:use-attribute-sets="toc.title.properties">
    <xsl:call-template name="gentext">
      <xsl:with-param name="key" select="'TableofContents'"/>
    </xsl:call-template>
  </fo:block>
</xsl:template>


<!-- Toc entry styles -->
<xsl:attribute-set name="toc.part.style">
	<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	<xsl:attribute name="font-weight">bold</xsl:attribute>   
    <xsl:attribute name="font-style">normal</xsl:attribute>
    <xsl:attribute name="font-size">12pt</xsl:attribute>
  	<xsl:attribute name="text-align">right</xsl:attribute>   
	<xsl:attribute name="space-before">15pt</xsl:attribute>
  	<xsl:attribute name="space-after">10pt</xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="toc.chapter.style">
	<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	<xsl:attribute name="font-weight">bold</xsl:attribute>   
    <xsl:attribute name="font-style">normal</xsl:attribute>
    <xsl:attribute name="font-size">12pt</xsl:attribute>
  	<xsl:attribute name="color"><xsl:value-of select="$title.color" /></xsl:attribute>
	<xsl:attribute name="text-align">right</xsl:attribute>   
	<xsl:attribute name="space-before">10pt</xsl:attribute>
  	<xsl:attribute name="space-after">10pt</xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="toc.title1.style">
	<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	<xsl:attribute name="font-weight">bold</xsl:attribute>   
    <xsl:attribute name="font-style">normal</xsl:attribute>
    <xsl:attribute name="font-size">10pt</xsl:attribute>
  	<xsl:attribute name="text-align">right</xsl:attribute>   
	<xsl:attribute name="space-before">5pt</xsl:attribute>
  	<xsl:attribute name="space-after">5pt</xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="toc.title2.style">
	<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	<xsl:attribute name="font-weight">normal</xsl:attribute>   
    <xsl:attribute name="font-style">normal</xsl:attribute>
    <xsl:attribute name="font-size">10pt</xsl:attribute>
  	<xsl:attribute name="text-align">right</xsl:attribute>   
	<xsl:attribute name="space-before">2pt</xsl:attribute>
  	<xsl:attribute name="space-after">2pt</xsl:attribute>
</xsl:attribute-set>


<xsl:attribute-set name="toc.title3.style">
	<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	<xsl:attribute name="font-weight">normal</xsl:attribute>   
    <xsl:attribute name="font-style">normal</xsl:attribute>
    <xsl:attribute name="font-size">10pt</xsl:attribute>
  	<xsl:attribute name="text-align">right</xsl:attribute>   
	<xsl:attribute name="space-before">2pt</xsl:attribute>
  	<xsl:attribute name="space-after">0pt</xsl:attribute>
</xsl:attribute-set>

<xsl:attribute-set name="toc.title.style">
	<xsl:attribute name="font-family">Helvetica</xsl:attribute>
	<xsl:attribute name="font-weight">normal</xsl:attribute>   
    <xsl:attribute name="font-style">normal</xsl:attribute>
    <xsl:attribute name="font-size">10pt</xsl:attribute>
  	<xsl:attribute name="text-align">right</xsl:attribute>   
	<xsl:attribute name="space-before">2pt</xsl:attribute>
  	<xsl:attribute name="space-after">0pt</xsl:attribute>
</xsl:attribute-set>


<xsl:template name="toc.line">
  
	<xsl:variable name="id">
    	<xsl:call-template name="object.id"/>
  	</xsl:variable>

  	<xsl:variable name="label">
    	<xsl:apply-templates select="." mode="label.markup"/>
  	</xsl:variable>
	
	<xsl:variable name="toc.level" select="count(ancestor-or-self::section)" />		
	<xsl:variable name="local.kind" select="local-name(.)" />	
	
	<xsl:choose>
		<xsl:when test="local-name(.) = 'part'">
			<fo:block 	text-align-last="justify" 
						end-indent="{$toc.indent.width}pt" 
						last-line-end-indent="-{$toc.indent.width}pt"
						xsl:use-attribute-sets="toc.part.style" >
			</fo:block>	
		</xsl:when>
		<!-- Managing chapters -->
		<xsl:when test="local-name(.) = 'chapter'">
			<fo:block 	text-align-last="justify" 
						end-indent="{$toc.indent.width}pt" 
						last-line-end-indent="-{$toc.indent.width}pt"
						xsl:use-attribute-sets="toc.chapter.style" >
				<fo:inline keep-with-next.within-line="always">
	      			<fo:basic-link internal-destination="{$id}">
						<xsl:call-template name="gentext">
				       		<xsl:with-param name="key" select="'Chapter'"/>
				     	</xsl:call-template>
						<xsl:text> </xsl:text>
						<xsl:if test="$label != ''">
		        			<xsl:copy-of select="$label"/>
		        			<xsl:value-of select="$autotoc.label.separator"/>
		        		</xsl:if>
						<xsl:apply-templates select="." mode="title.markup"/>
						<fo:inline keep-together.within-line="always">
        					<xsl:text> </xsl:text>
        					<fo:leader leader-pattern="dots" leader-pattern-width="3pt" leader-alignment="reference-area" keep-with-next.within-line="always"/>
        					<xsl:text> </xsl:text>
        					<fo:basic-link internal-destination="{$id}">
          						<fo:page-number-citation ref-id="{$id}"/>
        					</fo:basic-link>
      					</fo:inline>
					</fo:basic-link>
    			</fo:inline>	
			</fo:block>	
		</xsl:when>
		<xsl:otherwise>
			<xsl:choose>
				<!-- Title 1 -->
				<xsl:when test="$toc.level = 1">
					<fo:block 	text-align-last="justify" 
						end-indent="{$toc.indent.width}pt" 
						last-line-end-indent="-{$toc.indent.width}pt"
						xsl:use-attribute-sets="toc.title1.style" >
						<fo:inline keep-with-next.within-line="always">
			      			<fo:basic-link internal-destination="{$id}">
								<xsl:if test="$label != ''">
				        			<xsl:copy-of select="$label"/>
				        			<xsl:value-of select="$autotoc.label.separator"/>
				        		</xsl:if>
								<xsl:apply-templates select="." mode="title.markup"/>
								<fo:inline keep-together.within-line="always">
		        					<xsl:text> </xsl:text>
		        					<fo:leader leader-pattern="dots" leader-pattern-width="3pt" leader-alignment="reference-area" keep-with-next.within-line="always"/>
		        					<xsl:text> </xsl:text>
		        					<fo:basic-link internal-destination="{$id}">
		          						<fo:page-number-citation ref-id="{$id}"/>
		        					</fo:basic-link>
		      					</fo:inline>
							</fo:basic-link>
		    			</fo:inline>	
					</fo:block>	
				</xsl:when>
				
				<!-- Title 2 -->
				<xsl:when test="$toc.level = 2">
					<fo:block 	text-align-last="justify" 
						end-indent="{$toc.indent.width}pt" 
						last-line-end-indent="-{$toc.indent.width}pt"
						xsl:use-attribute-sets="toc.title2.style" >
						<fo:inline keep-with-next.within-line="always">
			      			<fo:basic-link internal-destination="{$id}">
								<xsl:if test="$label != ''">
				        			<xsl:copy-of select="$label"/>
				        			<xsl:value-of select="$autotoc.label.separator"/>
				        		</xsl:if>
								<xsl:apply-templates select="." mode="title.markup"/>
								<fo:inline keep-together.within-line="always">
		        					<xsl:text> </xsl:text>
		        					<fo:leader leader-pattern="dots" leader-pattern-width="3pt" leader-alignment="reference-area" keep-with-next.within-line="always"/>
		        					<xsl:text> </xsl:text>
		        					<fo:basic-link internal-destination="{$id}">
		          						<fo:page-number-citation ref-id="{$id}"/>
		        					</fo:basic-link>
		      					</fo:inline>
							</fo:basic-link>
		    			</fo:inline>	
					</fo:block>	
				</xsl:when>
				
				<!-- Title 3 -->
				<xsl:when test="$toc.level = 3">
					<fo:block 	text-align-last="justify" 
						end-indent="{$toc.indent.width}pt" 
						last-line-end-indent="-{$toc.indent.width}pt"
						xsl:use-attribute-sets="toc.title3.style" >
						<fo:inline keep-with-next.within-line="always">
			      			<fo:basic-link internal-destination="{$id}">
								<xsl:if test="$label != ''">
				        			<xsl:copy-of select="$label"/>
				        			<xsl:value-of select="$autotoc.label.separator"/>
				        		</xsl:if>
								<xsl:apply-templates select="." mode="title.markup"/>
								<fo:inline keep-together.within-line="always">
		        					<xsl:text> </xsl:text>
		        					<fo:leader leader-pattern="dots" leader-pattern-width="3pt" leader-alignment="reference-area" keep-with-next.within-line="always"/>
		        					<xsl:text> </xsl:text>
		        					<fo:basic-link internal-destination="{$id}">
		          						<fo:page-number-citation ref-id="{$id}"/>
		        					</fo:basic-link>
		      					</fo:inline>
							</fo:basic-link>
		    			</fo:inline>	
					</fo:block>	
				</xsl:when>
				<!-- Toc Other section level -->
				<xsl:otherwise>
					<fo:block 	text-align-last="justify" 
						end-indent="{$toc.indent.width}pt" 
						last-line-end-indent="-{$toc.indent.width}pt"
						xsl:use-attribute-sets="toc.title.style" >
						<fo:inline keep-with-next.within-line="always">
			      			<fo:basic-link internal-destination="{$id}">
								<xsl:if test="$label != ''">
				        			<xsl:copy-of select="$label"/>
				        			<xsl:value-of select="$autotoc.label.separator"/>
				        		</xsl:if>
								<xsl:apply-templates select="." mode="title.markup"/>
								<fo:inline keep-together.within-line="always">
		        					<xsl:text> </xsl:text>
		        					<fo:leader leader-pattern="dots" leader-pattern-width="3pt" leader-alignment="reference-area" keep-with-next.within-line="always"/>
		        					<xsl:text> </xsl:text>
		        					<fo:basic-link internal-destination="{$id}">
		          						<fo:page-number-citation ref-id="{$id}"/>
		        					</fo:basic-link>
		      					</fo:inline>
							</fo:basic-link>
		    			</fo:inline>	
					</fo:block>	
				</xsl:otherwise>
			</xsl:choose>
		</xsl:otherwise>
	</xsl:choose>

</xsl:template>

</xsl:stylesheet>
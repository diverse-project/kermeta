<?xml version="1.0" encoding="UTF-8"?>
<xmi:XMI xmi:version="2.1" xmlns:xmi="http://schema.omg.org/spec/XMI/2.1" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:DataTypes="http://MARTE.MARTE_Annexes.VSL/schemas/DataTypes/_pNWTkBBjEd20zIwSLfjspA/10" 
	xmlns:NFPs="http://MARTE.MARTE_Foundations/schemas/NFPs/_olhekBBjEd20zIwSLfjspA/11" 
	xmlns:Standard="http://www.eclipse.org/uml2/schemas/Standard/1" 
	xmlns:Time="http://MARTE.MARTE_Foundations/schemas/Time/_omGGUBBjEd20zIwSLfjspA/11" 
	xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" 
	xmlns:uml="http://www.eclipse.org/uml2/2.1.0/UML" 
	xsi:schemaLocation="http://MARTE.MARTE_Annexes.VSL/schemas/DataTypes/_pNWTkBBjEd20zIwSLfjspA/10 MARTE.profile.uml#_pOBB8BBjEd20zIwSLfjspA http://MARTE.MARTE_Foundations/schemas/NFPs/_olhekBBjEd20zIwSLfjspA/11 MARTE.profile.uml#_ol__sBBjEd20zIwSLfjspA http://www.eclipse.org/uml2/schemas/Standard/1 pathmap://UML_PROFILES/Standard.profile.uml#_yzU58YinEdqtvbnfB2L_5w http://MARTE.MARTE_Foundations/schemas/Time/_omGGUBBjEd20zIwSLfjspA/11 MARTE.profile.xmi#_onJPMBBjEd20zIwSLfjspA">
  <uml:Package xmi:id="_uBlQkA73EdyML4mHwjNDrw" name="MARTE_Library">
    <packageImport xmi:id="_uBlQkQ73EdyML4mHwjNDrw">
      <importedPackage xmi:type="uml:Model" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#_0"/>
    </packageImport>
    <packageImport xmi:id="_yZe1wA93EdyLrpTMPABxMQ" importedPackage="_dDxjEAeNEdytasR0-Ec7ew"/>
    <packageImport xmi:id="_yZe1wQ93EdyLrpTMPABxMQ" importedPackage="_3DJKAA4uEdysTsAUPnp57Q"/>
    <packageImport xmi:id="_yZomwA93EdyLrpTMPABxMQ" importedPackage="_X3JtMAeNEdytasR0-Ec7ew"/>
    <packageImport xmi:id="_yZxwsA93EdyLrpTMPABxMQ" importedPackage="_g2qR8A74EdyML4mHwjNDrw"/>
    <packageImport xmi:id="_yZxwsQ93EdyLrpTMPABxMQ" importedPackage="_l6ms8A74EdyML4mHwjNDrw"/>
    <packageImport xmi:id="_yZ7hsA93EdyLrpTMPABxMQ" importedPackage="_x9l9sA74EdyML4mHwjNDrw"/>
    <packageImport xmi:id="_yZ7hsQ93EdyLrpTMPABxMQ" importedPackage="_2GPOEA74EdyML4mHwjNDrw"/>
    <packagedElement xmi:type="uml:Package" xmi:id="_dDxjEAeNEdytasR0-Ec7ew" name="MARTE_PrimitivesTypes">
      <packagedElement xmi:type="uml:PrimitiveType" xmi:id="_HJ1zcAnfEdy9WM11hWri2g" name="Integer">
        <ownedOperation xmi:id="_KXsPgAnfEdy9WM11hWri2g" name="+" isStatic="true">
          <ownedParameter xmi:id="_NyydYAnfEdy9WM11hWri2g" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_SI4T4AnfEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_SIkx4AnfEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_SJBd0AnfEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_TJXggAnfEdy9WM11hWri2g" name="j" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_ZDGUAAnfEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_ZC9KEAnfEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_ZDZ2AAnfEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_39qYoAnoEdy9WM11hWri2g" name="-" isStatic="true">
          <ownedParameter xmi:id="_39qYpQnoEdy9WM11hWri2g" name="j" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_39qYpgnoEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_39qYpwnoEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_39qYqAnoEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_8NJ34AnoEdy9WM11hWri2g" name="*" isStatic="true">
          <ownedParameter xmi:id="_8NJ34QnoEdy9WM11hWri2g" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_8NJ34gnoEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_8NJ34wnoEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_8NJ35AnoEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_8NJ35QnoEdy9WM11hWri2g" name="j" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_8NJ35gnoEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_8NJ35wnoEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_8NJ36AnoEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_Bdd68AnpEdy9WM11hWri2g" name="/" isStatic="true">
          <ownedParameter xmi:id="_Bdd68QnpEdy9WM11hWri2g" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Bdd68gnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Bdd68wnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Bdd69AnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_9u2esAnpEdy9WM11hWri2g" name="j" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_9u2esQnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_9u2esgnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_9u2eswnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_EnrNIAnpEdy9WM11hWri2g" name=">" isStatic="true">
          <ownedParameter xmi:id="_EnrNIQnpEdy9WM11hWri2g" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_EnrNIgnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_EnrNIwnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_EnrNJAnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_EnrNJQnpEdy9WM11hWri2g" name="j" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_EnrNJgnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_EnrNJwnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_EnrNKAnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_HG9TAAnpEdy9WM11hWri2g" name="&lt;" isStatic="true">
          <ownedParameter xmi:id="_HG9TAQnpEdy9WM11hWri2g" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_HG9TAgnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_HG9TAwnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_HG9TBAnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_KUGH8AnqEdy9WM11hWri2g" name="j" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_KUGH8QnqEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_KUGH8gnqEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_KUGH8wnqEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_HaLxAAnpEdy9WM11hWri2g" name=">=" isStatic="true">
          <ownedParameter xmi:id="_HaLxAQnpEdy9WM11hWri2g" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_HaLxAgnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_HaLxAwnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_HaLxBAnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_MPe2kAnqEdy9WM11hWri2g" name="j" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_MPe2kQnqEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_MPe2kgnqEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_MPe2kwnqEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_SlucYAnpEdy9WM11hWri2g" name="&lt;=" isStatic="true">
          <ownedParameter xmi:id="_SlucYQnpEdy9WM11hWri2g" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_SlucYgnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_SlucYwnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_SlucZAnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_PIsfYAnqEdy9WM11hWri2g" name="j" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_PIsfYQnqEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_PIsfYgnqEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_PIsfYwnqEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_WH6wwAnpEdy9WM11hWri2g" name="==" isStatic="true">
          <ownedParameter xmi:id="_WH6wwQnpEdy9WM11hWri2g" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_WH6wwgnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_WH6wwwnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_WH6wxAnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_R2vaAAnqEdy9WM11hWri2g" name="j" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_R2vaAQnqEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_R2vaAgnqEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_R2vaAwnqEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_WtxP0AnpEdy9WM11hWri2g" name="&lt;>" isStatic="true">
          <ownedParameter xmi:id="_WtxP0QnpEdy9WM11hWri2g" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_WtxP0gnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_WtxP0wnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_WtxP1AnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_WtxP1QnpEdy9WM11hWri2g" name="j" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_WtxP1gnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_WtxP1wnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_WtxP2AnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_Te_VAA4uEdysTsAUPnp57Q" name="mod" isStatic="true">
          <ownedParameter xmi:id="_Te_VAQ4uEdysTsAUPnp57Q" name="i" type="_HJ1zcAnfEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Te_VAg4uEdysTsAUPnp57Q" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Te_VAw4uEdysTsAUPnp57Q" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Te_VBA4uEdysTsAUPnp57Q">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_Te_VBQ4uEdysTsAUPnp57Q" name="j" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Te_VBg4uEdysTsAUPnp57Q" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Te_VBw4uEdysTsAUPnp57Q" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Te_VCA4uEdysTsAUPnp57Q">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:PrimitiveType" xmi:id="_beo90AnpEdy9WM11hWri2g" name="Real">
        <ownedOperation xmi:id="_beo90QnpEdy9WM11hWri2g" name="+" isStatic="true">
          <ownedParameter xmi:id="_beo90gnpEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_beo90wnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_beo91AnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_beo91QnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_beo91gnpEdy9WM11hWri2g" name="" type="_beo90AnpEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_beo91wnpEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_beo92AnpEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_beo92QnpEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_beo92gnpEdy9WM11hWri2g" name="-" isStatic="true">
          <ownedParameter xmi:id="_OjiucAnrEdy9WM11hWri2g" name="" type="_beo90AnpEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_OjiucQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_OjiucgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_OjiucwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_beo93wnpEdy9WM11hWri2g" name="*" isStatic="true">
          <ownedParameter xmi:id="_Sj_FEAnrEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Sj_FEQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Sj_FEgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Sj_FEwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_Sj_FFAnrEdy9WM11hWri2g" name="" type="_beo90AnpEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Sj_FFQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Sj_FFgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Sj_FFwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_beo96AnpEdy9WM11hWri2g" name="/" isStatic="true">
          <ownedParameter xmi:id="_VGtggAnrEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_VGtggQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_VGtgggnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_VGtggwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_VGtghAnrEdy9WM11hWri2g" name="" type="_beo90AnpEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_VGtghQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_VGtghgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_VGtghwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_beo98QnpEdy9WM11hWri2g" name=">" isStatic="true">
          <ownedParameter xmi:id="_YrvGcAnrEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_YrvGcQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_YrvGcgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_YrvGcwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_bVc6sAnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_bVc6sQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_bVc6sgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_bVc6swnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_beo9-gnpEdy9WM11hWri2g" name="&lt;" isStatic="true">
          <ownedParameter xmi:id="_imgtgAnrEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_imgtgQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_imgtggnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_imgtgwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_imgthAnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_imgthQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_imgthgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_imgthwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_beo-AwnpEdy9WM11hWri2g" name=">=" isStatic="true">
          <ownedParameter xmi:id="_i9dN4AnrEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_i9dN4QnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_i9dN4gnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_i9dN4wnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_i9dN5AnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_i9dN5QnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_i9dN5gnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_i9dN5wnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_beo-DAnpEdy9WM11hWri2g" name="&lt;=" isStatic="true">
          <ownedParameter xmi:id="_jV5jEAnrEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_jV5jEQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_jV5jEgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_jV5jEwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_jV5jFAnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_jV5jFQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_jV5jFgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_jV5jFwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_beo-FQnpEdy9WM11hWri2g" name="==" isStatic="true">
          <ownedParameter xmi:id="_jssScAnrEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_jssScQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_jssScgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_jssScwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_jssSdAnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_jssSdQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_jssSdgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_jssSdwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_beo-HgnpEdy9WM11hWri2g" name="&lt;>" isStatic="true">
          <ownedParameter xmi:id="_kBs5IAnrEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_kBs5IQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_kBs5IgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_kBs5IwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_kBs5JAnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_kBs5JQnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_kBs5JgnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_kBs5JwnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_J5nm4An0Edy9WM11hWri2g" name="abs" isStatic="true">
          <ownedParameter xmi:id="_J5nm4Qn0Edy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_J5nm4gn0Edy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_J5nm4wn0Edy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_J5nm5An0Edy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_J5nm5Qn0Edy9WM11hWri2g" name="" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_J5nm5gn0Edy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_J5nm5wn0Edy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_J5nm6An0Edy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:PrimitiveType" xmi:id="_Ddte8AnqEdy9WM11hWri2g" name="Boolean">
        <ownedOperation xmi:id="_ypx80AnrEdy9WM11hWri2g" name="or" isStatic="true">
          <ownedParameter xmi:id="_ypx80QnrEdy9WM11hWri2g" name="b" type="_Ddte8AnqEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_ypx80gnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_ypx80wnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_ypx81AnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_ypx81QnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_ypx81gnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_ypx81wnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_ypx82AnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_4vSigAnrEdy9WM11hWri2g" name="xor" isStatic="true">
          <ownedParameter xmi:id="_4vSigQnrEdy9WM11hWri2g" name="b" type="_Ddte8AnqEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_4vSiggnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_4vSigwnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_4vSihAnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_4vSihQnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_4vSihgnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_4vSihwnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_4vSiiAnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_5EmEIAnrEdy9WM11hWri2g" name="and" isStatic="true">
          <ownedParameter xmi:id="_5EmEIQnrEdy9WM11hWri2g" name="b" type="_Ddte8AnqEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_5EmEIgnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_5EmEIwnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_5EmEJAnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_5EmEJQnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_5EmEJgnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_5EmEJwnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_5EmEKAnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_6grnoAnrEdy9WM11hWri2g" name="not" isStatic="true">
          <ownedParameter xmi:id="_6grnpQnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_6grnpgnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_6grnpwnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_6grnqAnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_6x0a8AnrEdy9WM11hWri2g" name="==" isStatic="true">
          <ownedParameter xmi:id="_6x0a8QnrEdy9WM11hWri2g" name="b" type="_Ddte8AnqEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_6x0a8gnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_6x0a8wnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_6x0a9AnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_6x0a9QnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_6x0a9gnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_6x0a9wnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_6x0a-AnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_7B6FYAnrEdy9WM11hWri2g" name="&lt;>" isStatic="true">
          <ownedParameter xmi:id="_7B6FYQnrEdy9WM11hWri2g" name="b" type="_Ddte8AnqEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_7B6FYgnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_7B6FYwnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_7B6FZAnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_7B6FZQnrEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_7B6FZgnrEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_7B6FZwnrEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_7B6FaAnrEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:PrimitiveType" xmi:id="_DBKa8AnsEdy9WM11hWri2g" name="UnlimitedNatural">
        <ownedOperation xmi:id="_J_4gkAnsEdy9WM11hWri2g" name="+" isStatic="true">
          <ownedParameter xmi:id="_J_4gkQnsEdy9WM11hWri2g" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_J_4gkgnsEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_J_4gkwnsEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_J_4glAnsEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_J_4glQnsEdy9WM11hWri2g" name="" type="_DBKa8AnsEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_J_4glgnsEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_J_4glwnsEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_J_4gmAnsEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_Q0z-wAnxEdy9WM11hWri2g" name="-" isStatic="true">
          <ownedParameter xmi:id="_Q0z-wQnxEdy9WM11hWri2g" name="" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Q0z-wgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Q0z-wwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Q0z-xAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_S2wBUAnxEdy9WM11hWri2g" name="*" isStatic="true">
          <ownedParameter xmi:id="_S2wBUQnxEdy9WM11hWri2g" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_S2wBUgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_S2wBUwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_S2wBVAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_S2wBVQnxEdy9WM11hWri2g" name="" type="_DBKa8AnsEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_S2wBVgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_S2wBVwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_S2wBWAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_Wqrl8AnxEdy9WM11hWri2g" name="/" isStatic="true">
          <ownedParameter xmi:id="_Wqrl8QnxEdy9WM11hWri2g" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Wqrl8gnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Wqrl8wnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Wqrl9AnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_Wqrl9QnxEdy9WM11hWri2g" name="" type="_beo90AnpEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Wqrl9gnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Wqrl9wnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Wqrl-AnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_bRIMoAnxEdy9WM11hWri2g" name=">" isStatic="true">
          <ownedParameter xmi:id="_bRIMoQnxEdy9WM11hWri2g" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_bRIMognxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_bRIMownxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_bRIMpAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_bRIMpQnxEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_bRIMpgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_bRIMpwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_bRIMqAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_gWbSgAnxEdy9WM11hWri2g" name="&lt;" isStatic="true">
          <ownedParameter xmi:id="_gWbSgQnxEdy9WM11hWri2g" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_gWbSggnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_gWbSgwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_gWbShAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_gWbShQnxEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_gWbShgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_gWbShwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_gWbSiAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_gwDTcAnxEdy9WM11hWri2g" name=">=" isStatic="true">
          <ownedParameter xmi:id="_gwDTcQnxEdy9WM11hWri2g" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_gwDTcgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_gwDTcwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_gwDTdAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_gwDTdQnxEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_gwDTdgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_gwDTdwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_gwDTeAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_iGCO8AnxEdy9WM11hWri2g" name="&lt;=" isStatic="true">
          <ownedParameter xmi:id="_iGCO8QnxEdy9WM11hWri2g" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_iGCO8gnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_iGCO8wnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_iGCO9AnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_iGCO9QnxEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_iGCO9gnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_iGCO9wnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_iGCO-AnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_iYgfAAnxEdy9WM11hWri2g" name="==" isStatic="true">
          <ownedParameter xmi:id="_iYgfAQnxEdy9WM11hWri2g" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_iYgfAgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_iYgfAwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_iYgfBAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_iYgfBQnxEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_iYgfBgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_iYgfBwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_iYgfCAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_isxe0AnxEdy9WM11hWri2g" name="&lt;>" isStatic="true">
          <ownedParameter xmi:id="_isxe0QnxEdy9WM11hWri2g" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_isxe0gnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_isxe0wnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_isxe1AnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_isxe1QnxEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_isxe1gnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_isxe1wnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_isxe2AnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_Z75uEA4uEdysTsAUPnp57Q" name="mod" isStatic="true">
          <ownedParameter xmi:id="_Z75uEQ4uEdysTsAUPnp57Q" name="un" type="_DBKa8AnsEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Z75uEg4uEdysTsAUPnp57Q" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Z75uEw4uEdysTsAUPnp57Q" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Z75uFA4uEdysTsAUPnp57Q">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_Z75uFQ4uEdysTsAUPnp57Q" name="" type="_DBKa8AnsEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Z75uFg4uEdysTsAUPnp57Q" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Z75uFw4uEdysTsAUPnp57Q" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Z75uGA4uEdysTsAUPnp57Q">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:PrimitiveType" xmi:id="_qZ3GUAnxEdy9WM11hWri2g" name="String">
        <ownedOperation xmi:id="_wukloAnxEdy9WM11hWri2g" name="concat" isStatic="true">
          <ownedParameter xmi:id="_wukloQnxEdy9WM11hWri2g" name="s" type="_qZ3GUAnxEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_wuklognxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_wuklownxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_wuklpAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_wuklpQnxEdy9WM11hWri2g" name="" type="_qZ3GUAnxEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_wuklpgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_wuklpwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_wuklqAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_6BRgEAnxEdy9WM11hWri2g" name="==" isStatic="true">
          <ownedParameter xmi:id="_6BRgEQnxEdy9WM11hWri2g" name="s" type="_qZ3GUAnxEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_6BRgEgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_6BRgEwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_6BRgFAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_6BRgFQnxEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_6BRgFgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_6BRgFwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_6BRgGAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_6efAgAnxEdy9WM11hWri2g" name="&lt;>" isStatic="true">
          <ownedParameter xmi:id="_6efAgQnxEdy9WM11hWri2g" name="s" type="_qZ3GUAnxEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_6efAggnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_6efAgwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_6efAhAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_6efAhQnxEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_6efAhgnxEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_6efAhwnxEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_6efAiAnxEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:PrimitiveType" xmi:id="_sexkYAnxEdy9WM11hWri2g" name="DateTime">
        <ownedOperation xmi:id="_9H2aAAnyEdy9WM11hWri2g" name="+" isStatic="true">
          <ownedParameter xmi:id="_9H2aAQnyEdy9WM11hWri2g" name="r" type="_beo90AnpEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_9H2aAgnyEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_9H2aAwnyEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_9H2aBAnyEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_9H2aBQnyEdy9WM11hWri2g" name="" type="_beo90AnpEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_9H2aBgnyEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_9H2aBwnyEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_9H2aCAnyEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_9H2aCQnyEdy9WM11hWri2g" name="-" isStatic="true">
          <ownedParameter xmi:id="_9H2aCgnyEdy9WM11hWri2g" name="" type="_beo90AnpEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_9H2aCwnyEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_9H2aDAnyEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_9H2aDQnyEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_GtjI8AnzEdy9WM11hWri2g" name=">" isStatic="true">
          <ownedParameter xmi:id="_GtjI8QnzEdy9WM11hWri2g" name="s" type="_sexkYAnxEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_GtjI8gnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_GtjI8wnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_GtjI9AnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_GtjI9QnzEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_GtjI9gnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_GtjI9wnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_GtjI-AnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_TEP_4AnzEdy9WM11hWri2g" name="&lt;" isStatic="true">
          <ownedParameter xmi:id="_TEP_4QnzEdy9WM11hWri2g" name="s" type="_sexkYAnxEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_TEP_4gnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_TEP_4wnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_TEP_5AnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_TEP_5QnzEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_TEP_5gnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_TEP_5wnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_TEP_6AnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_TtrXYAnzEdy9WM11hWri2g" name=">=" isStatic="true">
          <ownedParameter xmi:id="_TtrXYQnzEdy9WM11hWri2g" name="s" type="_sexkYAnxEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_TtrXYgnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_TtrXYwnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_TtrXZAnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_TtrXZQnzEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_TtrXZgnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_TtrXZwnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_TtrXaAnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_UXPRwAnzEdy9WM11hWri2g" name="&lt;=" isStatic="true">
          <ownedParameter xmi:id="_UXPRwQnzEdy9WM11hWri2g" name="s" type="_sexkYAnxEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_UXPRwgnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_UXPRwwnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_UXPRxAnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_UXPRxQnzEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_UXPRxgnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_UXPRxwnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_UXPRyAnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_UoOUEAnzEdy9WM11hWri2g" name="==" isStatic="true">
          <ownedParameter xmi:id="_UoOUEQnzEdy9WM11hWri2g" name="s" type="_sexkYAnxEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_UoOUEgnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_UoOUEwnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_UoOUFAnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_UoOUFQnzEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_UoOUFgnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_UoOUFwnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_UoOUGAnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
        <ownedOperation xmi:id="_U20wwAnzEdy9WM11hWri2g" name="&lt;>" isStatic="true">
          <ownedParameter xmi:id="_U20wwQnzEdy9WM11hWri2g" name="s" type="_sexkYAnxEdy9WM11hWri2g">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_U20wwgnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_U20wwwnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_U20wxAnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_U20wxQnzEdy9WM11hWri2g" name="" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false" direction="return">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_U20wxgnzEdy9WM11hWri2g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_U20wxwnzEdy9WM11hWri2g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_U20wyAnzEdy9WM11hWri2g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
        </ownedOperation>
      </packagedElement>
    </packagedElement>
    <packagedElement xmi:type="uml:Package" xmi:id="_3DJKAA4uEdysTsAUPnp57Q" name="MeasurementUnits">
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_Iaa3gA4yEdysTsAUPnp57Q" name="TimeUnitKind">
        <ownedLiteral xmi:id="_KvuiAA4yEdysTsAUPnp57Q" name="s"/>
        <ownedLiteral xmi:id="_LDGJ8A4yEdysTsAUPnp57Q" name="tick"/>
        <ownedLiteral xmi:id="_LK_hsA4yEdysTsAUPnp57Q" name="ms"/>
        <ownedLiteral xmi:id="_LTCqcA4yEdysTsAUPnp57Q" name="us"/>
        <ownedLiteral xmi:id="_OsmAMA4yEdysTsAUPnp57Q" name="min"/>
        <ownedLiteral xmi:id="_O8F0wA4yEdysTsAUPnp57Q" name="hrs"/>
        <ownedLiteral xmi:id="_PU1E4A4yEdysTsAUPnp57Q" name="day"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_ijhHUA4yEdysTsAUPnp57Q" name="PowerUnitKind">
        <ownedLiteral xmi:id="_lBxScA4yEdysTsAUPnp57Q" name="W"/>
        <ownedLiteral xmi:id="_lMpFsA4yEdysTsAUPnp57Q" name="mW"/>
        <ownedLiteral xmi:id="_lXXvAA4yEdysTsAUPnp57Q" name="KW"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_qFaygA4yEdysTsAUPnp57Q" name="FrequencyUnitKind">
        <ownedLiteral xmi:id="_tcvToA4yEdysTsAUPnp57Q" name="Hz"/>
        <ownedLiteral xmi:id="_tmRqIA4yEdysTsAUPnp57Q" name="KHz"/>
        <ownedLiteral xmi:id="_twkOkA4yEdysTsAUPnp57Q" name="MHz"/>
        <ownedLiteral xmi:id="_t46SQA4yEdysTsAUPnp57Q" name="GHz"/>
        <ownedLiteral xmi:id="_uA8z8A4yEdysTsAUPnp57Q" name="rpm"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_2pVmEA4yEdysTsAUPnp57Q" name="DataSizeUnitKind">
        <ownedLiteral xmi:id="_7OS_AA4yEdysTsAUPnp57Q" name="bit"/>
        <ownedLiteral xmi:id="_7df4oA4yEdysTsAUPnp57Q" name="Byte"/>
        <ownedLiteral xmi:id="_7pHSwA4yEdysTsAUPnp57Q" name="KB"/>
        <ownedLiteral xmi:id="_717mwA4yEdysTsAUPnp57Q" name="MB"/>
        <ownedLiteral xmi:id="_7-bbcA4yEdysTsAUPnp57Q" name="GB"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_DyNg0A4zEdysTsAUPnp57Q" name="DataTxRateUnitKind">
        <ownedLiteral xmi:id="_IdlDwA4zEdysTsAUPnp57Q" name="b_per_s"/>
        <ownedLiteral xmi:id="_InkGMA4zEdysTsAUPnp57Q" name="Kb_per_s"/>
        <ownedLiteral xmi:id="_IzfCUA4zEdysTsAUPnp57Q" name="Mb_per_s"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_UaKKgA4zEdysTsAUPnp57Q" name="EnergyUnitKind">
        <ownedLiteral xmi:id="_WkvLsA4zEdysTsAUPnp57Q" name="J"/>
        <ownedLiteral xmi:id="_Wr48kA4zEdysTsAUPnp57Q" name="KJ"/>
        <ownedLiteral xmi:id="_WzL3YA4zEdysTsAUPnp57Q" name="Wh"/>
        <ownedLiteral xmi:id="_W6pKQA4zEdysTsAUPnp57Q" name="KWh"/>
        <ownedLiteral xmi:id="_XCiiAA4zEdysTsAUPnp57Q" name="mWh"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_g5AQ0A4zEdysTsAUPnp57Q" name="LengthUnitKind">
        <ownedLiteral xmi:id="_oeL5gA4zEdysTsAUPnp57Q" name="m"/>
        <ownedLiteral xmi:id="_opXOwA4zEdysTsAUPnp57Q" name="cm"/>
        <ownedLiteral xmi:id="_oxQmgA4zEdysTsAUPnp57Q" name="mm"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_Sw5dsBFUEdyUJeMeN__D-A" name="AreaUnitKind">
        <ownedLiteral xmi:id="_XV22oBFUEdyUJeMeN__D-A" name="mm2"/>
        <ownedLiteral xmi:id="_XeM6UBFUEdyUJeMeN__D-A" name="um2"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_fuoVADJSEd211cMdxu944g" name="WeightUnitKind">
        <ownedLiteral xmi:id="_jcYZIDJSEd211cMdxu944g" name="g"/>
        <ownedLiteral xmi:id="_jleDsDJSEd211cMdxu944g" name="mg"/>
        <ownedLiteral xmi:id="_jrlSwDJSEd211cMdxu944g" name="Kg"/>
      </packagedElement>
      <profileApplication xmi:id="_-Fgb0F1GEdy5RcXm_JjfDg">
        <eAnnotations xmi:id="_-GG4wF1GEdy5RcXm_JjfDg" source="http://www.eclipse.org/uml2/2.0.0/UML">
          <references xmi:type="ecore:EPackage" href="MARTE.profile.uml#_ol__sBBjEd20zIwSLfjspA"/>
        </eAnnotations>
        <appliedProfile href="MARTE.profile.uml#_U_GAoAPMEdyuUt-4qHuVvQ"/>
      </profileApplication>
    </packagedElement>
    <packagedElement xmi:type="uml:Package" xmi:id="_X3JtMAeNEdytasR0-Ec7ew" name="GRM_BasicTypes">
      <packageImport xmi:id="_tfw-YBXFEdyBX5GHlMLAlg" importedPackage="_l6ms8A74EdyML4mHwjNDrw"/>
      <packagedElement xmi:type="uml:DataType" xmi:id="_Ng1kMAeOEdytasR0-Ec7ew" name="EDF_Parameters">
        <ownedAttribute xmi:id="_ie8gYAePEdytasR0-Ec7ew" name="deadline" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_ok0ScQePEdytasR0-Ec7ew" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_ok0ScAePEdytasR0-Ec7ew"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_ok-DcAePEdytasR0-Ec7ew">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_4GfMYBFaEdyUJeMeN__D-A" name="SchedPolicyKind">
        <ownedLiteral xmi:id="_563UEBFaEdyUJeMeN__D-A" name="EarliestDeadlineFirst"/>
        <ownedLiteral xmi:id="_6Pk_0BFaEdyUJeMeN__D-A" name="FIFO"/>
        <ownedLiteral xmi:id="_6VPi8BFaEdyUJeMeN__D-A" name="FixedPriority"/>
        <ownedLiteral xmi:id="_63EdoBFaEdyUJeMeN__D-A" name="LeastLaxityFirst"/>
        <ownedLiteral xmi:id="_6-EdgBFaEdyUJeMeN__D-A" name="RoundRobin"/>
        <ownedLiteral xmi:id="_7EB7kBFaEdyUJeMeN__D-A" name="TimeTableDriven"/>
        <ownedLiteral xmi:id="_7KSUkBFaEdyUJeMeN__D-A" name="Undef"/>
        <ownedLiteral xmi:id="_7RAAkBFaEdyUJeMeN__D-A" name="Other"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_HkE7wBFbEdyUJeMeN__D-A" name="ProtectProtocolKind">
        <ownedLiteral xmi:id="_JlHmcBFbEdyUJeMeN__D-A" name="FIFO"/>
        <ownedLiteral xmi:id="_JrFEgBFbEdyUJeMeN__D-A" name="NoPreemption"/>
        <ownedLiteral xmi:id="_JxyJcBFbEdyUJeMeN__D-A" name="PriorityCeiling"/>
        <ownedLiteral xmi:id="_KUzW8BFbEdyUJeMeN__D-A" name="PriorityInheritance"/>
        <ownedLiteral xmi:id="_KdTLoBFbEdyUJeMeN__D-A" name="StackBased"/>
        <ownedLiteral xmi:id="_LAweABFbEdyUJeMeN__D-A" name="Undef"/>
        <ownedLiteral xmi:id="_LGR3MBFbEdyUJeMeN__D-A" name="Other"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_UP5HEBFbEdyUJeMeN__D-A" name="PeriodicServerKind">
        <ownedLiteral xmi:id="_WTKmYBFbEdyUJeMeN__D-A" name="Sporadic"/>
        <ownedLiteral xmi:id="_Wb9WABFbEdyUJeMeN__D-A" name="Deferrable"/>
        <ownedLiteral xmi:id="_Wk52oBFbEdyUJeMeN__D-A" name="Undef"/>
        <ownedLiteral xmi:id="_WoevEBFbEdyUJeMeN__D-A" name="Other"/>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_d6I-0BFbEdyUJeMeN__D-A" name="SchedParameters">
        <ownedAttribute xmi:id="_i_STsBFbEdyUJeMeN__D-A" name="edf" visibility="public" type="_Ng1kMAeOEdytasR0-Ec7ew" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_mxR-oBFbEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_mxINoBFbEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_mxR-oRFbEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_jGSTkBFbEdyUJeMeN__D-A" name="fp" visibility="public" type="_rnEo4BFbEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_qvC0sBFbEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_qu5DsBFbEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_qvC0sRFbEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_jKwj4BFbEdyUJeMeN__D-A" name="pooling" visibility="public" type="_LBY6sBFcEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Zgr10BFcEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Zgir4BFcEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_Zgr10RFcEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_jWrgABFbEdyUJeMeN__D-A" name="server" visibility="public" type="_yayYYBFbEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_cRkCABFcEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_cRa4EBFcEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_cRkCARFcEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_CvstADMBEd2-hZkEerSQAg" name="tableEntry" visibility="public" isUnique="false">
          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String"/>
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Fhwk8DMBEd2-hZkEerSQAg" value="*"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_FhnbADMBEd2-hZkEerSQAg"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_Fh6V8DMBEd2-hZkEerSQAg">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_rnEo4BFbEdyUJeMeN__D-A" name="FixedPriorityParameters">
        <ownedAttribute xmi:id="_tn-JoBFbEdyUJeMeN__D-A" name="priority" visibility="public" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_vdYzIBFbEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_vdPpMBFbEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_vdikIBFbEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_yayYYBFbEdyUJeMeN__D-A" name="PeriodicServerParameters">
        <generalization xmi:id="_8xj38BQZEdyxdNz5FjtZ_g" general="_rnEo4BFbEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_2KsYoBFbEdyUJeMeN__D-A" name="kind" visibility="public" type="_UP5HEBFbEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_4oyywBFbEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_4opBwBFbEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_4oyywRFbEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_2RGioBFbEdyUJeMeN__D-A" name="backgroundPriority" visibility="public" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_8RGWMRFbEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_8RGWMBFbEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_8RQHMBFbEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_2a70EBFbEdyUJeMeN__D-A" name="initialBudget" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_AHHlgRFcEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_AHHlgBFcEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_AHRWgBFcEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_2kBeoBFbEdyUJeMeN__D-A" name="replenishPeriod" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_DHpXQRFcEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_DHpXQBFcEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_DHyhMBFcEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_2n5SABFbEdyUJeMeN__D-A" name="maxPendingReplenish" visibility="public" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_HsATQBFcEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Hr2iQBFcEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_HsKEQBFcEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_LBY6sBFcEdyUJeMeN__D-A" name="PoolingParameters">
        <generalization xmi:id="_OLDTUBQaEdyxdNz5FjtZ_g" general="_rnEo4BFbEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_MozkcBFcEdyUJeMeN__D-A" name="period" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_O6_CcBFcEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_O61RcBFcEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_O6_CcRFcEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_M1BbgBFcEdyUJeMeN__D-A" name="overhead" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_R0zIMBFcEdyUJeMeN__D-A" value="*"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_R0p-QBFcEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_R085MBFcEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <profileApplication xmi:id="_15RS0F1JEdy5RcXm_JjfDg">
        <eAnnotations xmi:id="_15bD0F1JEdy5RcXm_JjfDg" source="http://www.eclipse.org/uml2/2.0.0/UML">
          <references xmi:type="ecore:EPackage" href="MARTE.profile.uml#_pOBB8BBjEd20zIwSLfjspA"/>
        </eAnnotations>
        <appliedProfile href="MARTE.profile.uml#_9FdqwA-MEdyLh7muGbCqMw"/>
      </profileApplication>
    </packagedElement>
    <packagedElement xmi:type="uml:Package" xmi:id="_g2qR8A74EdyML4mHwjNDrw" name="MARTE_DataTypes">
      <packageImport xmi:id="_SuBaMBXFEdyBX5GHlMLAlg" importedPackage="_dDxjEAeNEdytasR0-Ec7ew"/>
      <packageImport xmi:id="_CcEQMB18EdyUAqqkOL30sg" importedPackage="_l6ms8A74EdyML4mHwjNDrw"/>
      <packagedElement xmi:type="uml:DataType" xmi:id="_WkRCQBD_EdyybZnLxHsjyA" name="IntegerVector">
        <ownedAttribute xmi:id="_YqhkIBD_EdyybZnLxHsjyA" name="vectorElem" visibility="public" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_dF8mkRD_EdyybZnLxHsjyA" value="*"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_dF8mkBD_EdyybZnLxHsjyA"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_dGGXkBD_EdyybZnLxHsjyA">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_yhmP0BD_EdyybZnLxHsjyA" name="IntegerMatrix">
        <ownedAttribute xmi:id="_2qGWQBD_EdyybZnLxHsjyA" name="matrixElem" visibility="public" type="_WkRCQBD_EdyybZnLxHsjyA" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_2qGWQRD_EdyybZnLxHsjyA" value="*"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_2qGWQhD_EdyybZnLxHsjyA"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_2qGWQxD_EdyybZnLxHsjyA">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:PrimitiveType" xmi:id="_bManMBEBEdyx6M3BlUjlCQ" name="VSL_Expression"/>
      <packagedElement xmi:type="uml:DataType" xmi:id="_ehpdoBEBEdyx6M3BlUjlCQ" name="IntegerInterval">
        <templateBinding xmi:id="_qgnOkB15EdyUAqqkOL30sg" signature="_ZPYXUB15EdyUAqqkOL30sg">
          <parameterSubstitution xmi:id="_aPAg8B18EdyUAqqkOL30sg" formal="_aVg48B15EdyUAqqkOL30sg" actual="_HJ1zcAnfEdy9WM11hWri2g"/>
        </templateBinding>
        <ownedAttribute xmi:id="_iG-lkBEBEdyx6M3BlUjlCQ" name="bound" visibility="public" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_lZ1dcREBEdyx6M3BlUjlCQ" value="2"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_lZ1dcBEBEdyx6M3BlUjlCQ" value="2"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_lZ-nYBEBEdyx6M3BlUjlCQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_wBn7gBEBEdyx6M3BlUjlCQ" name="TransmModeKind">
        <ownedLiteral xmi:id="_x0N6gBEBEdyx6M3BlUjlCQ" name="simplex"/>
        <ownedLiteral xmi:id="_x8j-MBEBEdyx6M3BlUjlCQ" name="halfDuplex"/>
        <ownedLiteral xmi:id="_yBoEYBEBEdyx6M3BlUjlCQ" name="fullDuplex"/>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_4TENQBEBEdyx6M3BlUjlCQ" name="UtilityType">
        <ownedOperation xmi:id="_BegcUBQnEdyxdNz5FjtZ_g" name="eq" isStatic="true">
          <ownedParameter xmi:id="_Dc9tEBQnEdyxdNz5FjtZ_g" name="u" type="_4TENQBEBEdyx6M3BlUjlCQ">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_HSkssBQnEdyxdNz5FjtZ_g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_HSRxwBQnEdyxdNz5FjtZ_g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_HSkssRQnEdyxdNz5FjtZ_g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_Mux2sBQnEdyxdNz5FjtZ_g" name="" type="_Ddte8AnqEdy9WM11hWri2g" direction="return"/>
        </ownedOperation>
        <ownedOperation xmi:id="__JbJYBQoEdyxdNz5FjtZ_g" name="lt" isStatic="true">
          <ownedParameter xmi:id="_FjqB4BQpEdyxdNz5FjtZ_g" name="u" type="_4TENQBEBEdyx6M3BlUjlCQ">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_HhxUYBQpEdyxdNz5FjtZ_g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_HhnjYBQpEdyxdNz5FjtZ_g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_Hh7FYBQpEdyxdNz5FjtZ_g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_RY9KABQrEdyxdNz5FjtZ_g" name="" type="_Ddte8AnqEdy9WM11hWri2g" direction="return"/>
        </ownedOperation>
        <ownedOperation xmi:id="_kjUQoBQsEdyxdNz5FjtZ_g" name="gt" isStatic="true">
          <ownedParameter xmi:id="_kjUQoRQsEdyxdNz5FjtZ_g" name="u" type="_4TENQBEBEdyx6M3BlUjlCQ">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_kjUQohQsEdyxdNz5FjtZ_g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_kjUQoxQsEdyxdNz5FjtZ_g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_kjUQpBQsEdyxdNz5FjtZ_g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_kjUQpRQsEdyxdNz5FjtZ_g" name="" type="_Ddte8AnqEdy9WM11hWri2g" direction="return"/>
        </ownedOperation>
        <ownedOperation xmi:id="_k7_2YBQsEdyxdNz5FjtZ_g" name="le" isStatic="true">
          <ownedParameter xmi:id="_k7_2YRQsEdyxdNz5FjtZ_g" name="u" type="_4TENQBEBEdyx6M3BlUjlCQ">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_k7_2YhQsEdyxdNz5FjtZ_g" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_k7_2YxQsEdyxdNz5FjtZ_g" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_k7_2ZBQsEdyxdNz5FjtZ_g">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_k7_2ZRQsEdyxdNz5FjtZ_g" name="" type="_Ddte8AnqEdy9WM11hWri2g" direction="return"/>
        </ownedOperation>
        <ownedOperation xmi:id="_LJfvYBQxEdyCa-N9ek5e_w" name="ge" isStatic="true">
          <ownedParameter xmi:id="_LJfvYRQxEdyCa-N9ek5e_w" name="u" type="_4TENQBEBEdyx6M3BlUjlCQ">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_LJfvYhQxEdyCa-N9ek5e_w" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_LJfvYxQxEdyCa-N9ek5e_w" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_LJfvZBQxEdyCa-N9ek5e_w">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_LJfvZRQxEdyCa-N9ek5e_w" name="" type="_Ddte8AnqEdy9WM11hWri2g" direction="return"/>
        </ownedOperation>
        <ownedOperation xmi:id="_LsyCoBQxEdyCa-N9ek5e_w" name="ne" isStatic="true">
          <ownedParameter xmi:id="_LsyCoRQxEdyCa-N9ek5e_w" name="u" type="_4TENQBEBEdyx6M3BlUjlCQ">
            <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_LsyCohQxEdyCa-N9ek5e_w" value="1"/>
            <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_LsyCoxQxEdyCa-N9ek5e_w" value="1"/>
            <defaultValue xmi:type="uml:LiteralString" xmi:id="_LsyCpBQxEdyCa-N9ek5e_w">
              <value xsi:nil="true"/>
            </defaultValue>
          </ownedParameter>
          <ownedParameter xmi:id="_LsyCpRQxEdyCa-N9ek5e_w" name="" type="_Ddte8AnqEdy9WM11hWri2g" direction="return"/>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_MgXXkBEDEdyx6M3BlUjlCQ" name="Array">
        <ownedTemplateSignature xmi:type="uml:RedefinableTemplateSignature" xmi:id="_KuPowBXcEdyC88-N-gXBsQ" parameter="_NXhYIBXcEdyC88-N-gXBsQ">
          <ownedParameter xmi:type="uml:ClassifierTemplateParameter" xmi:id="_NXhYIBXcEdyC88-N-gXBsQ" parameteredElement="_PMWLwBXcEdyC88-N-gXBsQ">
            <ownedParameteredElement xmi:type="uml:PrimitiveType" xmi:id="_PMWLwBXcEdyC88-N-gXBsQ" name="T" templateParameter="_NXhYIBXcEdyC88-N-gXBsQ"/>
          </ownedParameter>
        </ownedTemplateSignature>
        <ownedAttribute xmi:id="_gdsBoBEDEdyx6M3BlUjlCQ" name="vectorElement" visibility="public" type="_PMWLwBXcEdyC88-N-gXBsQ" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_1lrhUBXgEdyC88-N-gXBsQ" value="*"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_1lhwUBXgEdyC88-N-gXBsQ"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_l-jCIREDEdyx6M3BlUjlCQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_6ekucBXWEdyC88-N-gXBsQ" name="Realnterval">
        <templateBinding xmi:id="_rOLfMB15EdyUAqqkOL30sg" signature="_ZPYXUB15EdyUAqqkOL30sg">
          <parameterSubstitution xmi:id="_V3tJgB18EdyUAqqkOL30sg" formal="_aVg48B15EdyUAqqkOL30sg" actual="_beo90AnpEdy9WM11hWri2g"/>
        </templateBinding>
        <ownedAttribute xmi:id="_94t6EBXWEdyC88-N-gXBsQ" name="bound" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_HEJH0BXXEdyC88-N-gXBsQ" value="2"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_HD_94BXXEdyC88-N-gXBsQ" value="2"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_HEJH0RXXEdyC88-N-gXBsQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_DaoHAB14EdyUAqqkOL30sg" name="NFP_FrequencyInterval">
        <templateBinding xmi:id="_rxBGgB15EdyUAqqkOL30sg" signature="_ZPYXUB15EdyUAqqkOL30sg">
          <parameterSubstitution xmi:id="_uXxtYB15EdyUAqqkOL30sg" formal="_aVg48B15EdyUAqqkOL30sg" actual="_UDZSQBFSEdyUJeMeN__D-A"/>
        </templateBinding>
        <ownedAttribute xmi:id="_GZC_8B14EdyUAqqkOL30sg" name="bound" visibility="public" type="_UDZSQBFSEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Rua_8B18EdyUAqqkOL30sg" value="2"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_RuRO8B18EdyUAqqkOL30sg" value="2"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_QxUegR18EdyUAqqkOL30sg">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_TKe1oB15EdyUAqqkOL30sg" name="Interval">
        <ownedTemplateSignature xmi:type="uml:RedefinableTemplateSignature" xmi:id="_ZPYXUB15EdyUAqqkOL30sg" parameter="_aVg48B15EdyUAqqkOL30sg">
          <ownedParameter xmi:type="uml:ClassifierTemplateParameter" xmi:id="_aVg48B15EdyUAqqkOL30sg" parameteredElement="_bWRyYB15EdyUAqqkOL30sg">
            <ownedParameteredElement xmi:type="uml:DataType" xmi:id="_bWRyYB15EdyUAqqkOL30sg" name="T" templateParameter="_aVg48B15EdyUAqqkOL30sg"/>
          </ownedParameter>
        </ownedTemplateSignature>
        <ownedAttribute xmi:id="_Uc9xMB15EdyUAqqkOL30sg" name="bound" visibility="public" type="_bWRyYB15EdyUAqqkOL30sg" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_hJnqAB15EdyUAqqkOL30sg" value="2"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_hJd5AB15EdyUAqqkOL30sg" value="2"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_hJnqAR15EdyUAqqkOL30sg">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_rq2FsB18EdyUAqqkOL30sg" name="NFP_NaturalInterval">
        <templateBinding xmi:id="_vYQyoB18EdyUAqqkOL30sg" signature="_ZPYXUB15EdyUAqqkOL30sg">
          <parameterSubstitution xmi:id="_x5hOcB18EdyUAqqkOL30sg" formal="_aVg48B15EdyUAqqkOL30sg" actual="_Asy1gBFIEdyUJeMeN__D-A"/>
        </templateBinding>
        <ownedAttribute xmi:id="_9CLk8B18EdyUAqqkOL30sg" name="bound" visibility="public" type="_Asy1gBFIEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="__O2Q0R18EdyUAqqkOL30sg" value="2"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="__O2Q0B18EdyUAqqkOL30sg" value="2"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="__PAB0B18EdyUAqqkOL30sg">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <profileApplication xmi:id="_TaGeAF1LEdy5RcXm_JjfDg">
        <eAnnotations xmi:id="_TajJ8F1LEdy5RcXm_JjfDg" source="http://www.eclipse.org/uml2/2.0.0/UML">
          <references xmi:type="ecore:EPackage" href="MARTE.profile.uml#_pOBB8BBjEd20zIwSLfjspA"/>
        </eAnnotations>
        <appliedProfile href="MARTE.profile.uml#_9FdqwA-MEdyLh7muGbCqMw"/>
      </profileApplication>
    </packagedElement>
    <packagedElement xmi:type="uml:Package" xmi:id="_l6ms8A74EdyML4mHwjNDrw" name="BasicNFP_Types">
      <packageImport xmi:id="_EAt8oBXjEdyC88-N-gXBsQ" importedPackage="_3DJKAA4uEdysTsAUPnp57Q"/>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_oMZzEBD-EdyybZnLxHsjyA" name="SourceKind">
        <ownedLiteral xmi:id="_pfGxEBD-EdyybZnLxHsjyA" name="est"/>
        <ownedLiteral xmi:id="_pmGw8BD-EdyybZnLxHsjyA" name="meas"/>
        <ownedLiteral xmi:id="_pwifUBD-EdyybZnLxHsjyA" name="calc"/>
        <ownedLiteral xmi:id="_p73lkBD-EdyybZnLxHsjyA" name="req"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_vvfxEBD-EdyybZnLxHsjyA" name="DirectionKind">
        <ownedLiteral xmi:id="_xElUsBD-EdyybZnLxHsjyA" name="incr"/>
        <ownedLiteral xmi:id="_xLJPsBD-EdyybZnLxHsjyA" name="decr"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_0N52EBD-EdyybZnLxHsjyA" name="StatisticalQualifierKind">
        <ownedLiteral xmi:id="_3ARQABD-EdyybZnLxHsjyA" name="max"/>
        <ownedLiteral xmi:id="_3NYe8BD-EdyybZnLxHsjyA" name="min"/>
        <ownedLiteral xmi:id="_3TV9ABD-EdyybZnLxHsjyA" name="mean"/>
        <ownedLiteral xmi:id="_3aft4BD-EdyybZnLxHsjyA" name="range"/>
        <ownedLiteral xmi:id="_3hMy0BD-EdyybZnLxHsjyA" name="percent"/>
        <ownedLiteral xmi:id="_3nAf4BD-EdyybZnLxHsjyA" name="distrib"/>
        <ownedLiteral xmi:id="_3tap4BD-EdyybZnLxHsjyA" name="determ"/>
        <ownedLiteral xmi:id="_3z-k4BD-EdyybZnLxHsjyA" name="other"/>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_ACuvABD_EdyybZnLxHsjyA" name="NFP_CommonType">
        <ownedAttribute xmi:id="_EC4KsBD_EdyybZnLxHsjyA" name="expr" visibility="public" type="_bManMBEBEdyx6M3BlUjlCQ" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_GJSdkRD_EdyybZnLxHsjyA" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_GJSdkBD_EdyybZnLxHsjyA"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_GJSdkhD_EdyybZnLxHsjyA">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_EHDgEBD_EdyybZnLxHsjyA" name="source" visibility="public" type="_oMZzEBD-EdyybZnLxHsjyA" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_DUfX4BFFEdyBd9q9NMDXUQ" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_DUVm4BFFEdyBd9q9NMDXUQ"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_DUfX4RFFEdyBd9q9NMDXUQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_ELFEcBD_EdyybZnLxHsjyA" name="statQ" visibility="public" type="_0N52EBD-EdyybZnLxHsjyA" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Gei5EBFFEdyBd9q9NMDXUQ" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_GeZIEBFFEdyBd9q9NMDXUQ"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_Gei5ERFFEdyBd9q9NMDXUQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_EO830BD_EdyybZnLxHsjyA" name="dir" visibility="public" type="_vvfxEBD-EdyybZnLxHsjyA" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_JSZgwBFFEdyBd9q9NMDXUQ" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_JSQW0BFFEdyBd9q9NMDXUQ"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_JSZgwRFFEdyBd9q9NMDXUQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedOperation xmi:id="_sTlOQG01Ed2Ua4_dHwAW8g" name="bernoulli">
          <ownedParameter xmi:id="_3_KroG01Ed2Ua4_dHwAW8g" name="prob" type="_beo90AnpEdy9WM11hWri2g"/>
        </ownedOperation>
        <ownedOperation xmi:id="_qlje0G04Ed2Ua4_dHwAW8g" name="binomial">
          <ownedParameter xmi:id="_sBMWYG04Ed2Ua4_dHwAW8g" name="prob" type="_beo90AnpEdy9WM11hWri2g"/>
          <ownedParameter xmi:id="_TFVq4G06Ed2Ua4_dHwAW8g" name="trials" type="_HJ1zcAnfEdy9WM11hWri2g"/>
        </ownedOperation>
        <ownedOperation xmi:id="_bbQM8G06Ed2Ua4_dHwAW8g" name="exp">
          <ownedParameter xmi:id="_cr3gQG06Ed2Ua4_dHwAW8g" name="mean" type="_beo90AnpEdy9WM11hWri2g"/>
        </ownedOperation>
        <ownedOperation xmi:id="_OOJyIG09Ed2Ua4_dHwAW8g" name="gamma">
          <ownedParameter xmi:id="_PhmXAG09Ed2Ua4_dHwAW8g" name="k" type="_HJ1zcAnfEdy9WM11hWri2g"/>
          <ownedParameter xmi:id="_VvKFcG09Ed2Ua4_dHwAW8g" name="mean" type="_beo90AnpEdy9WM11hWri2g"/>
        </ownedOperation>
        <ownedOperation xmi:id="_TUCt4G09Ed2Ua4_dHwAW8g" name="normal">
          <ownedParameter xmi:id="_Y3SUAG09Ed2Ua4_dHwAW8g" name="mean" type="_beo90AnpEdy9WM11hWri2g"/>
          <ownedParameter xmi:id="_ZYzssG09Ed2Ua4_dHwAW8g" name="standDev" type="_beo90AnpEdy9WM11hWri2g"/>
        </ownedOperation>
        <ownedOperation xmi:id="_hOrcwG09Ed2Ua4_dHwAW8g" name="poisson">
          <ownedParameter xmi:id="_j70_gG09Ed2Ua4_dHwAW8g" name="mean" type="_beo90AnpEdy9WM11hWri2g"/>
        </ownedOperation>
        <ownedOperation xmi:id="_iNRL8G09Ed2Ua4_dHwAW8g" name="uniform">
          <ownedParameter xmi:id="_kvFocG09Ed2Ua4_dHwAW8g" name="min" type="_beo90AnpEdy9WM11hWri2g"/>
          <ownedParameter xmi:id="_kzQ90G09Ed2Ua4_dHwAW8g" name="max" type="_beo90AnpEdy9WM11hWri2g"/>
        </ownedOperation>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_55fyMBFGEdyBd9q9NMDXUQ" name="NFP_Boolean">
        <generalization xmi:id="_98XVQBFHEdyUJeMeN__D-A" general="_ACuvABD_EdyybZnLxHsjyA"/>
        <ownedAttribute xmi:id="_76_I0BFGEdyBd9q9NMDXUQ" name="value" visibility="public" type="_Ddte8AnqEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_-lKQERFGEdyBd9q9NMDXUQ" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_-lKQEBFGEdyBd9q9NMDXUQ"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_-lUBEBFGEdyBd9q9NMDXUQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_Asy1gBFIEdyUJeMeN__D-A" name="NFP_Natural">
        <generalization xmi:id="_YKYhUBFIEdyUJeMeN__D-A" general="_ACuvABD_EdyybZnLxHsjyA"/>
        <ownedAttribute xmi:id="_Asy1ghFIEdyUJeMeN__D-A" name="value" visibility="public" type="_DBKa8AnsEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Asy1gxFIEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Asy1hBFIEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_Asy1hRFIEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_B5VngBFQEdyUJeMeN__D-A" name="NFP_String">
        <generalization xmi:id="_B5VngRFQEdyUJeMeN__D-A" general="_ACuvABD_EdyybZnLxHsjyA"/>
        <ownedAttribute xmi:id="_B5VnghFQEdyUJeMeN__D-A" name="value" visibility="public" type="_qZ3GUAnxEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_B5VngxFQEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_B5VnhBFQEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_B5VnhRFQEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_Yq-MQBFQEdyUJeMeN__D-A" name="NFP_Real">
        <generalization xmi:id="_Yq-MQRFQEdyUJeMeN__D-A" general="_ACuvABD_EdyybZnLxHsjyA"/>
        <ownedAttribute xmi:id="_Yq-MQhFQEdyUJeMeN__D-A" name="value" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Yq-MQxFQEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Yq-MRBFQEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_Yq-MRRFQEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_0KWSgBFQEdyUJeMeN__D-A" name="NFP_Integer">
        <generalization xmi:id="_0KWSgRFQEdyUJeMeN__D-A" general="_ACuvABD_EdyybZnLxHsjyA"/>
        <ownedAttribute xmi:id="_0KWSghFQEdyUJeMeN__D-A" name="value" visibility="public" type="_HJ1zcAnfEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_0KWSgxFQEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_0KWShBFQEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_0KWShRFQEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_NIDGMBFREdyUJeMeN__D-A" name="NFP_DateTime">
        <generalization xmi:id="_NIDGMRFREdyUJeMeN__D-A" general="_ACuvABD_EdyybZnLxHsjyA"/>
        <ownedAttribute xmi:id="_NIDGMhFREdyUJeMeN__D-A" name="value" visibility="public" type="_sexkYAnxEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_NIDGMxFREdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_NIDGNBFREdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_NIDGNRFREdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_kMwX8BFREdyUJeMeN__D-A" name="NFP_Duration">
        <generalization xmi:id="_kMwX8RFREdyUJeMeN__D-A" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_kMwX8hFREdyUJeMeN__D-A" name="unit" visibility="public" type="_Iaa3gA4yEdysTsAUPnp57Q" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_kMwX8xFREdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_kMwX9BFREdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_kMwX9RFREdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_w72gwBFREdyUJeMeN__D-A" name="clock" visibility="public" type="_qZ3GUAnxEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_z4f4EBFREdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_z4WHEBFREdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_z4ppEBFREdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_xIXSwBFREdyUJeMeN__D-A" name="precision" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_3PheQRFREdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_3PheQBFREdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_3PqoMBFREdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_60p4QBFZEdyUJeMeN__D-A" name="min" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_AEmeIDJQEd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_AETjMDJQEd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_86duMBFZEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_AFWFADJQEd211cMdxu944g" name="max" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_FA5ZADJQEd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_FAwPEDJQEd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_FBDKADJQEd211cMdxu944g">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="__NI1EBFREdyUJeMeN__D-A" name="NFP_DataTxRate">
        <generalization xmi:id="_QFU6MBFSEdyUJeMeN__D-A" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_B7LvsBFSEdyUJeMeN__D-A" name="unit" visibility="public" type="_DyNg0A4zEdysTsAUPnp57Q" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_E9C-MBFSEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_E850QBFSEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_E9C-MRFSEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_F-6q4BFSEdyUJeMeN__D-A" name="precision" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Hd1f8RFSEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Hd1f8BFSEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_Hd-p4BFSEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_UDZSQBFSEdyUJeMeN__D-A" name="NFP_Frequency">
        <generalization xmi:id="_UDZSQRFSEdyUJeMeN__D-A" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_UDZSQhFSEdyUJeMeN__D-A" name="unit" visibility="public" type="_qFaygA4yEdysTsAUPnp57Q" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_UDZSQxFSEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_UDZSRBFSEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_UDZSRRFSEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_UDZSRhFSEdyUJeMeN__D-A" name="precision" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_UDZSRxFSEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_UDZSSBFSEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_UDZSSRFSEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_nWsu8BFSEdyUJeMeN__D-A" name="NFP_Power">
        <generalization xmi:id="_nWsu8RFSEdyUJeMeN__D-A" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_nWsu8hFSEdyUJeMeN__D-A" name="unit" visibility="public" type="_ijhHUA4yEdysTsAUPnp57Q" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_nWsu8xFSEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_nWsu9BFSEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_nWsu9RFSEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_nWsu9hFSEdyUJeMeN__D-A" name="precision" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_nWsu9xFSEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_nWsu-BFSEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_nWsu-RFSEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_5LrMcBFSEdyUJeMeN__D-A" name="NFP_DataSize">
        <generalization xmi:id="_5LrMcRFSEdyUJeMeN__D-A" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_5LrMchFSEdyUJeMeN__D-A" name="unit" visibility="public" type="_2pVmEA4yEdysTsAUPnp57Q" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_5LrMcxFSEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_5LrMdBFSEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_5LrMdRFSEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_5LrMdhFSEdyUJeMeN__D-A" name="precision" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_5LrMdxFSEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_5LrMeBFSEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_5LrMeRFSEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_QmcNwBFTEdyUJeMeN__D-A" name="NFP_Energy">
        <generalization xmi:id="_QmcNwRFTEdyUJeMeN__D-A" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_QmcNwhFTEdyUJeMeN__D-A" name="unit" visibility="public" type="_UaKKgA4zEdysTsAUPnp57Q" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_QmcNwxFTEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_QmcNxBFTEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_QmcNxRFTEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_QmcNxhFTEdyUJeMeN__D-A" name="precision" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_QmcNxxFTEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_QmcNyBFTEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_QmcNyRFTEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_g4VH4BFTEdyUJeMeN__D-A" name="NFP_Length">
        <generalization xmi:id="_g4VH4RFTEdyUJeMeN__D-A" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_g4VH4hFTEdyUJeMeN__D-A" name="unit" visibility="public" type="_g5AQ0A4zEdysTsAUPnp57Q" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_g4VH4xFTEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_g4VH5BFTEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_g4VH5RFTEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_g4VH5hFTEdyUJeMeN__D-A" name="precision" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_g4VH5xFTEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_g4VH6BFTEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_g4VH6RFTEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_0KmCwBFTEdyUJeMeN__D-A" name="NFP_Area">
        <generalization xmi:id="_0KmCwRFTEdyUJeMeN__D-A" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_0KmCwhFTEdyUJeMeN__D-A" name="unit" visibility="public" type="_Sw5dsBFUEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_0KmCwxFTEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_0KmCxBFTEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_0KmCxRFTEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_0KmCxhFTEdyUJeMeN__D-A" name="precision" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_0KmCxxFTEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_0KmCyBFTEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_0KmCyRFTEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_VDec8BFXEdyUJeMeN__D-A" name="ArrivalPattern">
        <ownedAttribute xmi:id="_3KX0UBFYEdyUJeMeN__D-A" name="periodic" visibility="public" type="_YOIbEBFXEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_7VjbURFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_7VjbUBFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_7VtMUBFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_3OsToBFYEdyUJeMeN__D-A" name="aperiodic" visibility="public" type="_n4-jUBFXEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_9wrZ8BFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_9who8BFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_9wrZ8RFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_3XCXUBFYEdyUJeMeN__D-A" name="burst" visibility="public" type="_LYgXABFYEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_MUS0YBFZEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_MUJDYBFZEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_MUS0YRFZEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_3bXdsBFYEdyUJeMeN__D-A" name="irregular" visibility="public" type="_iyYAcBFYEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_UCa9sRFZEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_UCa9sBFZEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_UCkHoBFZEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_3f1G8BFYEdyUJeMeN__D-A" name="closed" visibility="public" type="_xuG1YBFXEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_V1dBkRFZEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_V1dBkBFZEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_V1mykBFZEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_XSb88BFZEdyUJeMeN__D-A" name="sporadic" type="_69YoYBFXEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_fG9pMRFZEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_fG9pMBFZEdyUJeMeN__D-A"/>
        </ownedAttribute>
        <ownedAttribute xmi:id="_PN-GcDJPEd211cMdxu944g" name="open" visibility="public" type="_cb3rIDJPEd211cMdxu944g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_2970kDJPEd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_29yDkDJPEd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_2-FlkDJPEd211cMdxu944g">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_YOIbEBFXEdyUJeMeN__D-A" name="PeriodicPattern">
        <ownedAttribute xmi:id="_aP6soBFXEdyUJeMeN__D-A" name="period" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_cwjdYBFXEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_cwZsYBFXEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_cwjdYRFXEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_aVSU0BFXEdyUJeMeN__D-A" name="jitter" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_fsm-0RFXEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_fsm-0BFXEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_fswIwBFXEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_aZdDIBFXEdyUJeMeN__D-A" name="phase" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_hhbycRFXEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_hhbycBFXEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_hhk8YBFXEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_QZPmwDJPEd211cMdxu944g" name="occurrences" visibility="public" type="_0KWSgBFQEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_VaUT8DJPEd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_VaKi8DJPEd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_VanO4DJPEd211cMdxu944g">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_n4-jUBFXEdyUJeMeN__D-A" name="AperiodicPattern">
        <ownedAttribute xmi:id="_pZYmIBFXEdyUJeMeN__D-A" name="distribution" visibility="public" type="_ACuvABD_EdyybZnLxHsjyA" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_sI7VkRFXEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_sI7VkBFXEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_sJEfgBFXEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_xuG1YBFXEdyUJeMeN__D-A" name="ClosedPattern">
        <ownedAttribute xmi:id="_y5DlkBFXEdyUJeMeN__D-A" name="population" visibility="public" type="_0KWSgBFQEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_09YNwRFXEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_09YNwBFXEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_09h-wBFXEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_y-bNwBFXEdyUJeMeN__D-A" name="extDelay" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_32JxsRFXEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_32JxsBFXEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_32TisBFXEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_69YoYBFXEdyUJeMeN__D-A" name="SporadicPattern">
        <generalization xmi:id="_Jc-ecBFYEdyUJeMeN__D-A" general="_n4-jUBFXEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_9g_0oBFXEdyUJeMeN__D-A" name="minInterarrival" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_BdHr8RFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_BdHr8BFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_BdRc8BFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_9l6w4BFXEdyUJeMeN__D-A" name="maxInterarrival" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_EtTDQBFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_EtJSQBFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_EtTDQRFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_9qiLIBFXEdyUJeMeN__D-A" name="jitter" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_G6tWABFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_G6jlABFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_G62f8BFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_LYgXABFYEdyUJeMeN__D-A" name="BurstPattern">
        <generalization xmi:id="_iSV1gBFYEdyUJeMeN__D-A" general="_n4-jUBFXEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_RuH1QBFYEdyUJeMeN__D-A" name="minInterarrival" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_RuH1QRFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_RuH1QhFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_RuH1QxFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_RuH1RBFYEdyUJeMeN__D-A" name="maxInterarrival" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_RuH1RRFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_RuH1RhFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_RuH1RxFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_WdqGgBFYEdyUJeMeN__D-A" name="minEventInterval" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_ZizSgBFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_ZiphgBFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_ZizSgRFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_aOdeoBFYEdyUJeMeN__D-A" name="maxEventInterval" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_dEQAABFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_dEG2EBFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_dEQAARFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_d7PSYBFYEdyUJeMeN__D-A" name="burstSize" visibility="public" type="_0KWSgBFQEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_gQZy8RFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_gQZy8BFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_gQi84BFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_iyYAcBFYEdyUJeMeN__D-A" name="IrregularPattern">
        <generalization xmi:id="_wA6eUBFYEdyUJeMeN__D-A" general="_n4-jUBFXEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_l2xlkBFYEdyUJeMeN__D-A" name="phase" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_oB8coRFYEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_oB8coBFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_oCGNoBFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_l-q9UBFYEdyUJeMeN__D-A" name="interarrivals" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_sXaBABFYEdyUJeMeN__D-A" value="*"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_sXQ3EBFYEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_sXjyABFYEdyUJeMeN__D-A">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_ZPC-IBFaEdyUJeMeN__D-A" name="NFP_Percentage">
        <generalization xmi:id="_qAhXQBFaEdyUJeMeN__D-A" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_bD3xwBFaEdyUJeMeN__D-A" name="unit" visibility="public" type="_qZ3GUAnxEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_fNQpABFaEdyUJeMeN__D-A" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_fNG4ABFaEdyUJeMeN__D-A"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_g8H-kBFaEdyUJeMeN__D-A" value="%"/>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_cb3rIDJPEd211cMdxu944g" name="OpenPattern">
        <ownedAttribute xmi:id="_fPCWUDJPEd211cMdxu944g" name="interArrivalTime" visibility="public" type="_kMwX8BFREdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_jCv4gDJPEd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_jCmHgDJPEd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_jC5pgDJPEd211cMdxu944g">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_fWC9QDJPEd211cMdxu944g" name="arrivalRate" visibility="public" type="_UDZSQBFSEdyUJeMeN__D-A" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_nu8h4DJPEd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_nupm8DJPEd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_nvGS4DJPEd211cMdxu944g">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_fZU6wDJPEd211cMdxu944g" name="arrivalProcess" visibility="public" isUnique="false">
          <type xmi:type="uml:PrimitiveType" href="pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String"/>
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_rj2W4DJPEd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_rjtM8DJPEd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_rkJR0DJPEd211cMdxu944g">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_TyXpQDJQEd211cMdxu944g" name="NFP_Price">
        <generalization xmi:id="_qjjiEDJQEd211cMdxu944g" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_XPkv8DJQEd211cMdxu944g" name="unit" visibility="public" type="_qZ3GUAnxEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_cDX2IDJQEd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_cDOsMDJQEd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_cDhnIDJQEd211cMdxu944g" value="$US"/>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_sMCi0DJQEd211cMdxu944g" name="NFP_Weight">
        <generalization xmi:id="_4gAj8DJSEd211cMdxu944g" general="_Yq-MQBFQEdyUJeMeN__D-A"/>
        <ownedAttribute xmi:id="_0pa-0DJQEd211cMdxu944g" name="unit" visibility="public" type="_fuoVADJSEd211cMdxu944g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_AjjOgDJREd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_AjZdgDJREd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_6GXIoDJQEd211cMdxu944g">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_60bIgDJQEd211cMdxu944g" name="precision" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_8u87gDJQEd211cMdxu944g" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_8uzKgDJQEd211cMdxu944g"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_8vGFcDJQEd211cMdxu944g">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <profileApplication xmi:id="_xeZioF1MEdy5RcXm_JjfDg">
        <eAnnotations xmi:id="_xejToF1MEdy5RcXm_JjfDg" source="http://www.eclipse.org/uml2/2.0.0/UML">
          <references xmi:type="ecore:EPackage" href="MARTE.profile.uml#_ol__sBBjEd20zIwSLfjspA"/>
        </eAnnotations>
        <appliedProfile href="MARTE.profile.uml#_U_GAoAPMEdyuUt-4qHuVvQ"/>
      </profileApplication>
      <profileApplication xmi:id="_2BlvEF1OEdy5RcXm_JjfDg">
        <eAnnotations xmi:id="_2CCbAF1OEdy5RcXm_JjfDg" source="http://www.eclipse.org/uml2/2.0.0/UML">
          <references xmi:type="ecore:EPackage" href="MARTE.profile.uml#_pOBB8BBjEd20zIwSLfjspA"/>
        </eAnnotations>
        <appliedProfile href="MARTE.profile.uml#_9FdqwA-MEdyLh7muGbCqMw"/>
      </profileApplication>
    </packagedElement>
    <packagedElement xmi:type="uml:Package" xmi:id="_x9l9sA74EdyML4mHwjNDrw" name="TimeTypesLibrary">
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_WAvb0A75EdyML4mHwjNDrw" name="TimeNatureKind">
        <ownedLiteral xmi:id="_XWRrYA75EdyML4mHwjNDrw" name="discrete"/>
        <ownedLiteral xmi:id="_XbC2oA75EdyML4mHwjNDrw" name="dense"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_a_LrwA75EdyML4mHwjNDrw" name="TimeInterpretationKind">
        <ownedLiteral xmi:id="_c-ScwA75EdyML4mHwjNDrw" name="duration"/>
        <ownedLiteral xmi:id="_dEi1wA75EdyML4mHwjNDrw" name="instant"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_eMs4wA-KEdyNj8xzjk-DoA" name="EventKind">
        <ownedLiteral xmi:id="_fkw34A-KEdyNj8xzjk-DoA" name="start"/>
        <ownedLiteral xmi:id="_frd80A-KEdyNj8xzjk-DoA" name="finish"/>
        <ownedLiteral xmi:id="_f2WXIA-KEdyNj8xzjk-DoA" name="send"/>
        <ownedLiteral xmi:id="_f8mwIA-KEdyNj8xzjk-DoA" name="receive"/>
        <ownedLiteral xmi:id="_gCHiQA-KEdyNj8xzjk-DoA" name="consume"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_MDyyoA-KEdyNj8xzjk-DoA" name="TimeStandardKind">
        <ownedLiteral xmi:id="_NZezMA-KEdyNj8xzjk-DoA" name="TAI"/>
        <ownedLiteral xmi:id="_OLZYUA-KEdyNj8xzjk-DoA" name="UT0"/>
        <ownedLiteral xmi:id="_OQxAgA-KEdyNj8xzjk-DoA" name="UT1"/>
        <ownedLiteral xmi:id="_OViLwA-KEdyNj8xzjk-DoA" name="UTC"/>
        <ownedLiteral xmi:id="_OaTXAA-KEdyNj8xzjk-DoA" name="Local"/>
        <ownedLiteral xmi:id="_OqGGgA-KEdyNj8xzjk-DoA" name="TT"/>
        <ownedLiteral xmi:id="_OwDkkA-KEdyNj8xzjk-DoA" name="TBD"/>
        <ownedLiteral xmi:id="_O1kWsA-KEdyNj8xzjk-DoA" name="TCG"/>
        <ownedLiteral xmi:id="_O6oc4A-KEdyNj8xzjk-DoA" name="TCB"/>
        <ownedLiteral xmi:id="_PAAFEA-KEdyNj8xzjk-DoA" name="Sidereal"/>
        <ownedLiteral xmi:id="_PFELQA-KEdyNj8xzjk-DoA" name="GPS"/>
      </packagedElement>
    </packagedElement>
    <packagedElement xmi:type="uml:Package" xmi:id="_2GPOEA74EdyML4mHwjNDrw" name="TimeLibrary">
      <packageImport xmi:id="__w7xwA74EdyML4mHwjNDrw" importedPackage="_x9l9sA74EdyML4mHwjNDrw"/>
      <packagedElement xmi:type="uml:DataType" xmi:id="_xV1ksA75EdyML4mHwjNDrw" name="TimedValueType">
        <ownedTemplateSignature xmi:type="uml:RedefinableTemplateSignature" xmi:id="_GYVQAA9bEdyP5Zh6SHZeeg" parameter="_FXMg0BgnEdyHL91mBnoLNQ">
          <ownedParameter xmi:type="uml:ClassifierTemplateParameter" xmi:id="_FXMg0BgnEdyHL91mBnoLNQ" parameteredElement="_JBiEkBgnEdyHL91mBnoLNQ">
            <ownedParameteredElement xmi:type="uml:Enumeration" xmi:id="_JBiEkBgnEdyHL91mBnoLNQ" name="TUK" templateParameter="_FXMg0BgnEdyHL91mBnoLNQ"/>
          </ownedParameter>
        </ownedTemplateSignature>
        <ownedAttribute xmi:id="_WqAuwA9bEdyP5Zh6SHZeeg" name="unit" visibility="public" type="_JBiEkBgnEdyHL91mBnoLNQ" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_Y74qwQ9bEdyP5Zh6SHZeeg" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_Y74qwA9bEdyP5Zh6SHZeeg"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_Y8CbwA9bEdyP5Zh6SHZeeg">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_E2_cQA9fEdy-lroUn0KWEw" name="value" visibility="public" type="_beo90AnpEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_K0mDIQ9fEdy-lroUn0KWEw" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_K0mDIA9fEdy-lroUn0KWEw"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_K0vNEA9fEdy-lroUn0KWEw">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_cQrtcA-JEdyNj8xzjk-DoA" name="expr" visibility="public" type="_Y-aEYA-JEdyNj8xzjk-DoA" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_ekOdYQ-JEdyNj8xzjk-DoA" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_ekOdYA-JEdyNj8xzjk-DoA"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_ekOdYg-JEdyNj8xzjk-DoA">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_cW8tgA-JEdyNj8xzjk-DoA" name="onClock" visibility="public" type="_qZ3GUAnxEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_tkIVwQ-KEdyNj8xzjk-DoA" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_tkIVwA-KEdyNj8xzjk-DoA"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_jObisg-JEdyNj8xzjk-DoA">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:PrimitiveType" xmi:id="_Y-aEYA-JEdyNj8xzjk-DoA" name="ClockedValueSpecification"/>
      <packagedElement xmi:type="uml:InstanceSpecification" xmi:id="_42TqEA-JEdyNj8xzjk-DoA" name="idealClk" classifier="_BKyhUBBREdyt6tGzWCpUVA"/>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_DY4Q8A-KEdyNj8xzjk-DoA" name="TimeUnitKind">
        <ownedLiteral xmi:id="_FahYkA-KEdyNj8xzjk-DoA" name="s"/>
        <ownedLiteral xmi:id="_Fh-EYA-KEdyNj8xzjk-DoA" name="ms"/>
        <ownedLiteral xmi:id="_Fm5AoA-KEdyNj8xzjk-DoA" name="us"/>
        <ownedLiteral xmi:id="_FsjjwA-KEdyNj8xzjk-DoA" name="ns"/>
        <ownedLiteral xmi:id="_FyEV4A-KEdyNj8xzjk-DoA" name="min"/>
        <ownedLiteral xmi:id="_F3SNEA-KEdyNj8xzjk-DoA" name="hrs"/>
        <ownedLiteral xmi:id="_F8fdMA-KEdyNj8xzjk-DoA" name="day"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Enumeration" xmi:id="_axYBYA-KEdyNj8xzjk-DoA" name="LogicalTimeUnit">
        <ownedLiteral xmi:id="_b_v5AA-KEdyNj8xzjk-DoA" name="tick"/>
      </packagedElement>
      <packagedElement xmi:type="uml:Class" xmi:id="_BKyhUBBREdyt6tGzWCpUVA" name="IdealClock">
        <ownedOperation xmi:id="_oPkhUA-JEdyNj8xzjk-DoA" name="currentTime">
          <ownedParameter xmi:id="_pz2XgA-JEdyNj8xzjk-DoA" name="" type="_beo90AnpEdy9WM11hWri2g" direction="return"/>
        </ownedOperation>
      </packagedElement>
      <profileApplication xmi:id="_zQ7BcF1SEdy5RcXm_JjfDg">
        <eAnnotations xmi:id="_zREycF1SEdy5RcXm_JjfDg" source="http://www.eclipse.org/uml2/2.0.0/UML">
          <references xmi:type="ecore:EPackage" href="MARTE.profile.uml#_ol__sBBjEd20zIwSLfjspA"/>
        </eAnnotations>
        <appliedProfile href="MARTE.profile.uml#_U_GAoAPMEdyuUt-4qHuVvQ"/>
      </profileApplication>
      <profileApplication xmi:id="_SavZIF1TEdy5RcXm_JjfDg">
        <eAnnotations xmi:id="_SbMFEF1TEdy5RcXm_JjfDg" source="http://www.eclipse.org/uml2/2.0.0/UML">
          <references xmi:type="ecore:EPackage" href="MARTE.profile.uml#_pOBB8BBjEd20zIwSLfjspA"/>
        </eAnnotations>
        <appliedProfile href="MARTE.profile.uml#_9FdqwA-MEdyLh7muGbCqMw"/>
      </profileApplication>
      <profileApplication xmi:id="_YCdPkF1TEdy5RcXm_JjfDg">
        <eAnnotations xmi:id="_YC57gF1TEdy5RcXm_JjfDg" source="http://www.eclipse.org/uml2/2.0.0/UML">
          <references xmi:type="ecore:EPackage" href="MARTE.profile.uml#_onJPMBBjEd20zIwSLfjspA"/>
        </eAnnotations>
        <appliedProfile href="MARTE.profile.uml#_WStkoAPMEdyuUt-4qHuVvQ"/>
      </profileApplication>
    </packagedElement>
    <packagedElement xmi:type="uml:Package" xmi:id="_RTwjABgzEdyHL91mBnoLNQ" name="RS_Library">
      <packageImport xmi:id="_ZKGCQBmVEdyKYph7niDrbQ" importedPackage="_g2qR8A74EdyML4mHwjNDrw"/>
      <packagedElement xmi:type="uml:DataType" xmi:id="_hwFnsBmVEdyKYph7niDrbQ" name="TilerSpecification">
        <ownedAttribute xmi:id="_kL8mIBmVEdyKYph7niDrbQ" name="origin" visibility="public" type="_WkRCQBD_EdyybZnLxHsjyA" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_nsWKwBmVEdyKYph7niDrbQ" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_nsNA0BmVEdyKYph7niDrbQ"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_nsWKwRmVEdyKYph7niDrbQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_kTPg8BmVEdyKYph7niDrbQ" name="paving" visibility="public" type="_yhmP0BD_EdyybZnLxHsjyA" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_prv2sBmVEdyKYph7niDrbQ" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_prmswBmVEdyKYph7niDrbQ" value="1"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_pr5nsBmVEdyKYph7niDrbQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
        <ownedAttribute xmi:id="_kWrPcBmVEdyKYph7niDrbQ" name="fitting" visibility="public" type="_WkRCQBD_EdyybZnLxHsjyA" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="_sk0VkBmVEdyKYph7niDrbQ" value="1"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="_skqkkBmVEdyKYph7niDrbQ"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="_sk9fgBmVEdyKYph7niDrbQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <packagedElement xmi:type="uml:DataType" xmi:id="_5jgZkBmVEdyKYph7niDrbQ" name="ShapeSpecification">
        <ownedAttribute xmi:id="_8nS6sBmVEdyKYph7niDrbQ" name="size" visibility="public" type="_DBKa8AnsEdy9WM11hWri2g" isUnique="false">
          <upperValue xmi:type="uml:LiteralUnlimitedNatural" xmi:id="__IEOUBmVEdyKYph7niDrbQ" value="*"/>
          <lowerValue xmi:type="uml:LiteralInteger" xmi:id="__H6dUBmVEdyKYph7niDrbQ"/>
          <defaultValue xmi:type="uml:LiteralString" xmi:id="__INYQBmVEdyKYph7niDrbQ">
            <value xsi:nil="true"/>
          </defaultValue>
        </ownedAttribute>
      </packagedElement>
      <profileApplication xmi:id="_8F8r8F1TEdy5RcXm_JjfDg">
        <eAnnotations xmi:id="_8GGc8F1TEdy5RcXm_JjfDg" source="http://www.eclipse.org/uml2/2.0.0/UML">
          <references xmi:type="ecore:EPackage" href="MARTE.profile.uml#_pOBB8BBjEd20zIwSLfjspA"/>
        </eAnnotations>
        <appliedProfile href="MARTE.profile.uml#_9FdqwA-MEdyLh7muGbCqMw"/>
      </profileApplication>
    </packagedElement>
    <profileApplication xmi:id="_uCLtgA73EdyML4mHwjNDrw">
      <eAnnotations xmi:id="_uCU3cA73EdyML4mHwjNDrw" source="http://www.eclipse.org/uml2/2.0.0/UML">
        <references xmi:type="ecore:EPackage" href="pathmap://UML_PROFILES/Standard.profile.uml#_yzU58YinEdqtvbnfB2L_5w"/>
      </eAnnotations>
      <appliedProfile href="pathmap://UML_PROFILES/Standard.profile.uml#_0"/>
    </profileApplication>
  </uml:Package>
  <Standard:ModelLibrary xmi:id="_uJeoUA73EdyML4mHwjNDrw" base_Package="_uBlQkA73EdyML4mHwjNDrw"/>
  <Standard:ModelLibrary xmi:id="__M2CsA73EdyML4mHwjNDrw" base_Package="_dDxjEAeNEdytasR0-Ec7ew"/>
  <Standard:ModelLibrary xmi:id="_AEbK8A74EdyML4mHwjNDrw" base_Package="_3DJKAA4uEdysTsAUPnp57Q"/>
  <Standard:ModelLibrary xmi:id="_A85rEA74EdyML4mHwjNDrw" base_Package="_X3JtMAeNEdytasR0-Ec7ew"/>
  <Standard:ModelLibrary xmi:id="_jCkv4A74EdyML4mHwjNDrw" base_Package="_g2qR8A74EdyML4mHwjNDrw"/>
  <Standard:ModelLibrary xmi:id="_op16YA74EdyML4mHwjNDrw" base_Package="_l6ms8A74EdyML4mHwjNDrw"/>
  <Standard:ModelLibrary xmi:id="_0iQS0A74EdyML4mHwjNDrw" base_Package="_x9l9sA74EdyML4mHwjNDrw"/>
  <Standard:ModelLibrary xmi:id="_4aqHwA74EdyML4mHwjNDrw" base_Package="_2GPOEA74EdyML4mHwjNDrw"/>
  <Standard:ModelLibrary xmi:id="_chpJkB2KEdyzLoIDsxpCNg" base_Package="_RTwjABgzEdyHL91mBnoLNQ"/>
  <NFPs:Unit xmi:id="_AG1aYF1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_KvuiAA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_MJPcUF1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_LDGJ8A4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_M_BNwF1HEdy5RcXm_JjfDg" convFactor="0.001" baseUnit="_AG1aYF1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_LK_hsA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_VsrhcF1HEdy5RcXm_JjfDg" convFactor="0.001" baseUnit="_M_BNwF1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_LTCqcA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_aHCz8F1HEdy5RcXm_JjfDg" convFactor="60" baseUnit="_AG1aYF1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_OsmAMA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_cXlTMF1HEdy5RcXm_JjfDg" convFactor="60" baseUnit="_aHCz8F1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_O8F0wA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_ihZKEF1HEdy5RcXm_JjfDg" convFactor="24" baseUnit="_cXlTMF1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_PU1E4A4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_putFUF1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_lBxScA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_qYIc0F1HEdy5RcXm_JjfDg" convFactor="1E-3" baseUnit="_putFUF1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_lMpFsA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_tcXp4F1HEdy5RcXm_JjfDg" convFactor="1E3" baseUnit="_putFUF1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_lXXvAA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_7A6M8F1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_tcvToA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_78NXkF1HEdy5RcXm_JjfDg" convFactor="1E3" baseUnit="_7A6M8F1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_tmRqIA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="__HmVgF1HEdy5RcXm_JjfDg" convFactor="1E6" baseUnit="_7A6M8F1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_twkOkA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_CaJEUF1IEdy5RcXm_JjfDg" convFactor="1E9" baseUnit="_7A6M8F1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_t46SQA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_FahFEF1IEdy5RcXm_JjfDg" convFactor="0.0167" baseUnit="_7A6M8F1HEdy5RcXm_JjfDg" base_EnumerationLiteral="_uA8z8A4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_VkWPYF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_7OS_AA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_WgGF8F1IEdy5RcXm_JjfDg" convFactor="8" baseUnit="_VkWPYF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_7df4oA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_YzwxsF1IEdy5RcXm_JjfDg" convFactor="1024" baseUnit="_WgGF8F1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_7pHSwA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_cKyX4F1IEdy5RcXm_JjfDg" convFactor="1024" baseUnit="_YzwxsF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_717mwA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_fOvREF1IEdy5RcXm_JjfDg" convFactor="1024" baseUnit="_cKyX4F1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_7-bbcA4yEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_jJ9wgF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_oeL5gA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_j04VwF1IEdy5RcXm_JjfDg" convFactor="1E-2" baseUnit="_jJ9wgF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_opXOwA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_mpB4YF1IEdy5RcXm_JjfDg" convFactor="1E-3" baseUnit="_jJ9wgF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_oxQmgA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_smWLYF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_WkvLsA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_tO4LAF1IEdy5RcXm_JjfDg" convFactor="1E3" baseUnit="_smWLYF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_Wr48kA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_y3fZUF1IEdy5RcXm_JjfDg" convFactor="2.778E-4" baseUnit="_smWLYF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_WzL3YA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_0y3g4F1IEdy5RcXm_JjfDg" convFactor="1E3" baseUnit="_y3fZUF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_W6pKQA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_3nBqkF1IEdy5RcXm_JjfDg" convFactor="1E-3" baseUnit="_y3fZUF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_XCiiAA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_7fRugF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_XV22oBFUEdyUJeMeN__D-A"/>
  <NFPs:Unit xmi:id="_8HEHQF1IEdy5RcXm_JjfDg" convFactor="1E-6" baseUnit="_7fRugF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_XeM6UBFUEdyUJeMeN__D-A"/>
  <NFPs:Unit xmi:id="__WyyoF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_IdlDwA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="__88MoF1IEdy5RcXm_JjfDg" convFactor="1024" baseUnit="__WyyoF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_InkGMA4zEdysTsAUPnp57Q"/>
  <NFPs:Unit xmi:id="_DTq34F1JEdy5RcXm_JjfDg" convFactor="1024" baseUnit="__88MoF1IEdy5RcXm_JjfDg" base_EnumerationLiteral="_IzfCUA4zEdysTsAUPnp57Q"/>
  <DataTypes:ChoiceType xmi:id="_TmZDAF1KEdy5RcXm_JjfDg" base_DataType="_d6I-0BFbEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_VGgK4F1KEdy5RcXm_JjfDg" base_DataType="_rnEo4BFbEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_YMY9wF1KEdy5RcXm_JjfDg" base_DataType="_yayYYBFbEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_Y3wO8F1KEdy5RcXm_JjfDg" base_DataType="_LBY6sBFcEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_gjfyoF1KEdy5RcXm_JjfDg" base_DataType="_Ng1kMAeOEdytasR0-Ec7ew"/>
  <DataTypes:IntervalType xmi:id="_U15GkF1LEdy5RcXm_JjfDg" intervalAttrib="_Uc9xMB15EdyUAqqkOL30sg" base_DataType="_TKe1oB15EdyUAqqkOL30sg"/>
  <DataTypes:IntervalType xmi:id="_cfjmoF1LEdy5RcXm_JjfDg" intervalAttrib="_iG-lkBEBEdyx6M3BlUjlCQ" base_DataType="_ehpdoBEBEdyx6M3BlUjlCQ"/>
  <DataTypes:IntervalType xmi:id="_fxEasF1LEdy5RcXm_JjfDg" intervalAttrib="_94t6EBXWEdyC88-N-gXBsQ" base_DataType="_6ekucBXWEdyC88-N-gXBsQ"/>
  <DataTypes:IntervalType xmi:id="_r2AMMF1LEdy5RcXm_JjfDg" intervalAttrib="_GZC_8B14EdyUAqqkOL30sg" base_DataType="_DaoHAB14EdyUAqqkOL30sg"/>
  <DataTypes:IntervalType xmi:id="_wnLcMF1LEdy5RcXm_JjfDg" intervalAttrib="_9CLk8B18EdyUAqqkOL30sg" base_DataType="_rq2FsB18EdyUAqqkOL30sg"/>
  <DataTypes:CollectionType xmi:id="_Lp0jIF1MEdy5RcXm_JjfDg" collectionAttrib="_YqhkIBD_EdyybZnLxHsjyA" base_DataType="_WkRCQBD_EdyybZnLxHsjyA"/>
  <DataTypes:CollectionType xmi:id="_XQNXcF1MEdy5RcXm_JjfDg" collectionAttrib="_2qGWQBD_EdyybZnLxHsjyA" base_DataType="_yhmP0BD_EdyybZnLxHsjyA"/>
  <NFPs:NfpType xmi:id="_ynt7IF1MEdy5RcXm_JjfDg" base_DataType="_ACuvABD_EdyybZnLxHsjyA" exprAttrib="_EC4KsBD_EdyybZnLxHsjyA"/>
  <NFPs:NfpType xmi:id="_zXP6oF1MEdy5RcXm_JjfDg" base_DataType="_55fyMBFGEdyBd9q9NMDXUQ" valueAttrib="_76_I0BFGEdyBd9q9NMDXUQ"/>
  <NFPs:NfpType xmi:id="_McHtUF1NEdy5RcXm_JjfDg" base_DataType="_Asy1gBFIEdyUJeMeN__D-A" valueAttrib="_Asy1ghFIEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_R2SP8F1NEdy5RcXm_JjfDg" base_DataType="_B5VngBFQEdyUJeMeN__D-A" valueAttrib="_B5VnghFQEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_VsTfQF1NEdy5RcXm_JjfDg" base_DataType="_Yq-MQBFQEdyUJeMeN__D-A" valueAttrib="_Yq-MQhFQEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_Y9qiUF1NEdy5RcXm_JjfDg" base_DataType="_0KWSgBFQEdyUJeMeN__D-A" valueAttrib="_0KWSghFQEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_dOgscF1NEdy5RcXm_JjfDg" base_DataType="_NIDGMBFREdyUJeMeN__D-A" valueAttrib="_NIDGMhFREdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_ihN8MF1NEdy5RcXm_JjfDg" valueAttrib="_60p4QBFZEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_5R-XMF1NEdy5RcXm_JjfDg" base_DataType="_kMwX8BFREdyUJeMeN__D-A" unitAttrib="_kMwX8hFREdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_-mK0sF1NEdy5RcXm_JjfDg" base_DataType="__NI1EBFREdyUJeMeN__D-A" unitAttrib="_B7LvsBFSEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_DyK_gF1OEdy5RcXm_JjfDg" base_DataType="_UDZSQBFSEdyUJeMeN__D-A" unitAttrib="_UDZSQhFSEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_H5CHMF1OEdy5RcXm_JjfDg" base_DataType="_nWsu8BFSEdyUJeMeN__D-A" unitAttrib="_nWsu8hFSEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_LJWocF1OEdy5RcXm_JjfDg" base_DataType="_5LrMcBFSEdyUJeMeN__D-A" unitAttrib="_5LrMchFSEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_Pb1xUF1OEdy5RcXm_JjfDg" base_DataType="_QmcNwBFTEdyUJeMeN__D-A" unitAttrib="_QmcNwhFTEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_RaWscF1OEdy5RcXm_JjfDg" base_DataType="_g4VH4BFTEdyUJeMeN__D-A" unitAttrib="_g4VH4hFTEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_VSdmcF1OEdy5RcXm_JjfDg" base_DataType="_0KmCwBFTEdyUJeMeN__D-A" unitAttrib="_0KmCwhFTEdyUJeMeN__D-A"/>
  <NFPs:NfpType xmi:id="_ZJhXkF1OEdy5RcXm_JjfDg" base_DataType="_ZPC-IBFaEdyUJeMeN__D-A" unitAttrib="_bD3xwBFaEdyUJeMeN__D-A"/>
  <DataTypes:ChoiceType xmi:id="_3LWMcF1OEdy5RcXm_JjfDg" base_DataType="_VDec8BFXEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_6zXcAF1OEdy5RcXm_JjfDg" base_DataType="_YOIbEBFXEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_7ebyQF1OEdy5RcXm_JjfDg" base_DataType="_n4-jUBFXEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_8AZ24F1OEdy5RcXm_JjfDg" base_DataType="_xuG1YBFXEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_8lEDIF1OEdy5RcXm_JjfDg" base_DataType="_69YoYBFXEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_9ksUIF1OEdy5RcXm_JjfDg" base_DataType="_LYgXABFYEdyUJeMeN__D-A"/>
  <DataTypes:TupleType xmi:id="_-KZCMF1OEdy5RcXm_JjfDg" base_DataType="_iyYAcBFYEdyUJeMeN__D-A"/>
  <NFPs:Unit xmi:id="_0L74MF1SEdy5RcXm_JjfDg" base_EnumerationLiteral="_b_v5AA-KEdyNj8xzjk-DoA"/>
  <NFPs:Unit xmi:id="_1CBysF1SEdy5RcXm_JjfDg" base_EnumerationLiteral="_FahYkA-KEdyNj8xzjk-DoA"/>
  <NFPs:Unit xmi:id="_1z8X0F1SEdy5RcXm_JjfDg" convFactor="1E-3" baseUnit="_1CBysF1SEdy5RcXm_JjfDg" base_EnumerationLiteral="_Fh-EYA-KEdyNj8xzjk-DoA"/>
  <NFPs:Unit xmi:id="_8BhUYF1SEdy5RcXm_JjfDg" convFactor="1E-3" baseUnit="_1z8X0F1SEdy5RcXm_JjfDg" base_EnumerationLiteral="_Fm5AoA-KEdyNj8xzjk-DoA"/>
  <NFPs:Unit xmi:id="_CVDH8F1TEdy5RcXm_JjfDg" convFactor="1E-3" baseUnit="_8BhUYF1SEdy5RcXm_JjfDg" base_EnumerationLiteral="_FsjjwA-KEdyNj8xzjk-DoA"/>
  <NFPs:Unit xmi:id="_FuUJ0F1TEdy5RcXm_JjfDg" convFactor="60" baseUnit="_1CBysF1SEdy5RcXm_JjfDg" base_EnumerationLiteral="_FyEV4A-KEdyNj8xzjk-DoA"/>
  <NFPs:Unit xmi:id="_IgrjwF1TEdy5RcXm_JjfDg" convFactor="60" baseUnit="_FuUJ0F1TEdy5RcXm_JjfDg" base_EnumerationLiteral="_F3SNEA-KEdyNj8xzjk-DoA"/>
  <NFPs:Unit xmi:id="_K41G4F1TEdy5RcXm_JjfDg" convFactor="24" baseUnit="_IgrjwF1TEdy5RcXm_JjfDg" base_EnumerationLiteral="_F8fdMA-KEdyNj8xzjk-DoA"/>
  <DataTypes:TupleType xmi:id="_TpRBwF1TEdy5RcXm_JjfDg" base_DataType="_xV1ksA75EdyML4mHwjNDrw"/>
  <Time:ClockType xmi:id="_aRNmIF1TEdy5RcXm_JjfDg" nature="dense" unitType="_DY4Q8A-KEdyNj8xzjk-DoA" getTime="_oPkhUA-JEdyNj8xzjk-DoA" base_Class="_BKyhUBBREdyt6tGzWCpUVA"/>
  <Time:Clock xmi:id="_mmsVEF1TEdy5RcXm_JjfDg" base_InstanceSpecification="_42TqEA-JEdyNj8xzjk-DoA"/>
  <DataTypes:TupleType xmi:id="_9C5cYF1TEdy5RcXm_JjfDg" base_DataType="_hwFnsBmVEdyKYph7niDrbQ"/>
  <DataTypes:CollectionType xmi:id="__wpcEF1TEdy5RcXm_JjfDg" collectionAttrib="_8nS6sBmVEdyKYph7niDrbQ" base_DataType="_5jgZkBmVEdyKYph7niDrbQ"/>
  <DataTypes:TupleType xmi:id="_LCERQDJQEd211cMdxu944g" base_DataType="_cb3rIDJPEd211cMdxu944g"/>
  <NFPs:NfpType xmi:id="_uZDM8DJQEd211cMdxu944g" base_DataType="_TyXpQDJQEd211cMdxu944g" unitAttrib="_XPkv8DJQEd211cMdxu944g"/>
  <NFPs:Unit xmi:id="_n1DpkDJSEd211cMdxu944g" base_EnumerationLiteral="_jcYZIDJSEd211cMdxu944g"/>
  <NFPs:Unit xmi:id="_od5LMDJSEd211cMdxu944g" convFactor="1E-3" baseUnit="_n1DpkDJSEd211cMdxu944g" base_EnumerationLiteral="_jleDsDJSEd211cMdxu944g"/>
  <NFPs:Unit xmi:id="_pDdWYDJSEd211cMdxu944g" convFactor="1E3" baseUnit="_n1DpkDJSEd211cMdxu944g" base_EnumerationLiteral="_jrlSwDJSEd211cMdxu944g"/>
</xmi:XMI>

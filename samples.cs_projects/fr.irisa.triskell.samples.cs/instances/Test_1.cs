<?xml version="1.0" encoding="UTF-8"?>
<cs:Root xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:cs="file:///udd/zdrey/Workspaces/KMWorkspace/fr.irisa.triskell.kermeta.samples/src/ecore/cs/cs.ecore">
  <template name="main template" referer="//@template.0/@decision.0">
    <decision name="first_decision" target="//@template.0"/>
    <decision xsi:type="cs:Iteration" name="staff_iteration" target="//@template.1"/>
  </template>
  <template name="gender_template" content="[Name] is a [Employment]. Its gender is [Gender]" referer="//@template.0/@decision.1">
    <decision xsi:type="cs:Value" name="Name"/>
    <decision xsi:type="cs:Value" name="Employment" target="//@template.2"/>
    <decision name="gender decision"/>
    <decision xsi:type="cs:Value" name="Gender"/>
  </template>
  <template name="Final Template" referer="//@template.1/@decision.1"/>
</cs:Root>

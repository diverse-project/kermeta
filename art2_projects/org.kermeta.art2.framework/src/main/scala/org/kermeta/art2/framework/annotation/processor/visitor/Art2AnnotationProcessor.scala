/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.annotation.processor.visitor

import com.sun.mirror.apt.AnnotationProcessor
import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.declaration.AnnotationTypeDeclaration
import com.sun.mirror.declaration.Declaration
import com.sun.mirror.declaration.TypeDeclaration
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ChannelType
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.annotation.ChannelTypeFragment
import org.kermeta.art2.annotation.ComponentType
import org.kermeta.art2.framework.generator.Art2Generator
import org.kermeta.art2.framework.Art2Utility
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.generator.Art2ActivatorGenerator
import org.kermeta.art2.framework.generator.Art2FactoryGenerator
import scala.collection.JavaConversions._

class Art2AnnotationProcessor(env : AnnotationProcessorEnvironment) extends AnnotationProcessor {

  def process()={

    var root = Art2Factory.eINSTANCE.createContainerRoot();
    Art2Utility.root_=(root)
    env.getTypeDeclarations().foreach{typeDecl=>
      var ctAnnotation = typeDecl.getAnnotation(classOf[ComponentType]);
      if(ctAnnotation != null){
        processComponentType(ctAnnotation,typeDecl,root)
      }

      var channelTypeAnnotation = typeDecl.getAnnotation(classOf[ChannelTypeFragment]);
      if(channelTypeAnnotation != null){
        processChannelType(channelTypeAnnotation,typeDecl,root)
      }
      //TODO
    }

    Art2Generator.generatePort(root, env.getFiler());
    Art2FactoryGenerator.generateFactory(root, env.getFiler());
    Art2ActivatorGenerator.generateActivator(root, env.getFiler());
    System.out.println("Saving to "+ Art2Generator.generateLibURI(env));
    Art2XmiHelper.save(Art2Generator.generateLibURI(env), root);


  }



  def processChannelType(channelTypeAnnotation : ChannelTypeFragment,typeDecl : TypeDeclaration,root : ContainerRoot) = {
    var channelType = Art2Factory.eINSTANCE.createChannelType();
    var ctname = channelTypeAnnotation.name
    if(ctname.equals("empty")){
      ctname = typeDecl.getSimpleName
    }
    channelType.setName(ctname)
    channelType.setBean(typeDecl.getQualifiedName)
    channelType.setFactoryBean(typeDecl.getQualifiedName+"Factory")
    root.getTypeDefinitions.add(channelType)

    //RUN VISITOR
    typeDecl.accept(ChannelTypeFragmentVisitor(channelType,env))
  }

  def processComponentType(componentTypeAnnotation : ComponentType,typeDecl : TypeDeclaration,root : ContainerRoot) = {
    var componentType = Art2Factory.eINSTANCE.createComponentType();
    var ctname = componentTypeAnnotation.name
    if(ctname.equals("empty")){
      ctname = typeDecl.getSimpleName
    }
    componentType.setName(ctname)
    componentType.setBean(typeDecl.getQualifiedName)
    componentType.setFactoryBean(typeDecl.getQualifiedName+"Factory")
    
    root.getTypeDefinitions.add(componentType)
    //RUN VISITOR
    typeDecl.accept(ComponentDefinitionVisitor(componentType,env))

  }




}

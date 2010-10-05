/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote

import org.jboss.netty.channel.ChannelHandlerContext
import org.jboss.netty.channel.MessageEvent

case class ART_NETTY_MESSAGE(ctx :ChannelHandlerContext,e : MessageEvent)
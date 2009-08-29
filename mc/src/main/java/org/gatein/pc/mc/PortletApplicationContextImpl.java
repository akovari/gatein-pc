/******************************************************************************
 * JBoss, a division of Red Hat                                               *
 * Copyright 2008, Red Hat Middleware, LLC, and individual                    *
 * contributors as indicated by the @authors tag. See the                     *
 * copyright.txt in the distribution for a full listing of                    *
 * individual contributors.                                                   *
 *                                                                            *
 * This is free software; you can redistribute it and/or modify it            *
 * under the terms of the GNU Lesser General Public License as                *
 * published by the Free Software Foundation; either version 2.1 of           *
 * the License, or (at your option) any later version.                        *
 *                                                                            *
 * This software is distributed in the hope that it will be useful,           *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU           *
 * Lesser General Public License for more details.                            *
 *                                                                            *
 * You should have received a copy of the GNU Lesser General Public           *
 * License along with this software; if not, write to the Free                *
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA         *
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.                   *
 ******************************************************************************/
package org.gatein.pc.mc;

import org.gatein.pc.portlet.container.PortletApplicationContext;
import org.gatein.pc.portlet.container.managed.ManagedPortletApplication;
import org.gatein.wci.WebApp;

import javax.servlet.ServletContext;

/**
 * @author <a href="mailto:julien@jboss.org">Julien Viet</a>
 * @version $Revision: 630 $
 */
public class PortletApplicationContextImpl implements PortletApplicationContext
{

   /** . */
   private final WebApp webApp;

   ManagedPortletApplication managedPortletApplication;

   public PortletApplicationContextImpl(WebApp webApp)
   {
      this.webApp = webApp;
   }

   public ServletContext getServletContext()
   {
      return webApp.getServletContext();
   }

   public String getContextPath()
   {
      return webApp.getContextPath();
   }

   public ClassLoader getClassLoader()
   {
      return webApp.getClassLoader();
   }

   public void managedStart()
   {
      managedPortletApplication.managedStart();
   }

   public void managedStop()
   {
      managedPortletApplication.managedStop();
   }
}
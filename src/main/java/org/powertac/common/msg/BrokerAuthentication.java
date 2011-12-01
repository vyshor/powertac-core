/*
 * Copyright 2011 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.powertac.common.msg;

import org.powertac.common.Broker;
import org.powertac.common.state.Domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * This message is used for authenticating a broker with the server.
 * Broker sends this message to the server with its username and game-token which 
 * it receives from the web-app.  The game-token is ignored in research mode.
 * If the login is accepted, a {@link BrokerAccept} message is returned.
 */

@Domain
@XStreamAlias("broker-authentication")
public class BrokerAuthentication
{
  private Broker broker;
  
  /**
   * Creates an instance
   */
  public BrokerAuthentication (Broker broker)
  {
    super();
    this.broker = broker;
  }

  /**
   * @return the broker
   */
  public Broker getBroker ()
  {
    return broker;
  }

  /**
   * @param broker the broker to set
   */
  public void setBroker (Broker broker)
  {
    this.broker = broker;
  }
}

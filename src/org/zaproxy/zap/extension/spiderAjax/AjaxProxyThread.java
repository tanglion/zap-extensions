/*
 * Zed Attack Proxy (ZAP) and its related class files.
 *
 * ZAP is an HTTP/HTTPS proxy for assessing web application security.
 *
 * Copyright 2016 The ZAP development team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zaproxy.zap.extension.spiderAjax;

import java.net.Socket;

import org.parosproxy.paros.network.HttpSender;
import org.zaproxy.zap.extension.spiderAjax.internal.ProxyServer;
import org.zaproxy.zap.extension.spiderAjax.internal.ProxyThread;

class AjaxProxyThread extends ProxyThread {

    AjaxProxyThread(ProxyServer server, Socket socket) {
        // TODO Replace literal 10 with HttpSender.AJAX_SPIDER_INITIATOR once available.
        super(server, socket, new HttpSender(server.getConnectionParam(), true, 10));
    }

}

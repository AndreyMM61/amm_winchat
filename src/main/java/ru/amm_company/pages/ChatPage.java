/*
 * Copyright 2016 Андрей.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.amm_company.pages;

import ru.amm_company.panels.TemplatePage;
import static ru.amm_company.panels.TemplatePage.CONTENT_ID;

/**
 *
 * @author Андрей
 */
public class ChatPage extends TemplatePage {
    
    public ChatPage() {
        super();
	replace(new InputPanel(CONTENT_ID));
//	replace(new MessagePanel(CONTENT_ID));
	getMenuPanel().setVisible(false);
    }
    
}
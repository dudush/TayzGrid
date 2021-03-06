/*
* Copyright (c) 2015, Alachisoft. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.alachisoft.tayzgrid.tools;

import com.alachisoft.tayzgrid.tools.common.ArgumentAttributeAnnontation;

public class AddTestDataParam extends com.alachisoft.tayzgrid.tools.common.CommandLineParamsBase {

    private String s_cacheId = "";
    private long s_itemCount = 10;
    private int s_dataSize = 1024;

    public AddTestDataParam() {
    }

    @ArgumentAttributeAnnontation(shortNotation = "", fullNotation = "", appendText = "", defaultValue = "")
    public final void setCacheId(String value) {
        this.s_cacheId = value;        
    }
    @ArgumentAttributeAnnontation(shortNotation = "", fullNotation = "", appendText = "", defaultValue = "")
    public final String getCacheId() {
        return this.s_cacheId;        
    }
    @ArgumentAttributeAnnontation(shortNotation = "-C", fullNotation = "--count", appendText = "", defaultValue = "10")
    public final void setItemCount(long value) {
        this.s_itemCount = value;        
    }
    @ArgumentAttributeAnnontation(shortNotation = "-C", fullNotation = "--count", appendText = "", defaultValue = "10")
    public final long getItemCount() {
        return this.s_itemCount;        
    }
    @ArgumentAttributeAnnontation(shortNotation = "-S", fullNotation = "--size", appendText = "", defaultValue = "1024")
    public final void setDataSize(int value) {
        this.s_dataSize = value;        
    }
    @ArgumentAttributeAnnontation(shortNotation = "-S", fullNotation = "--size", appendText = "", defaultValue = "1024")
    public final int getDataSize() {
        return this.s_dataSize;        
    }
    
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleAgentInfoAttributeShowInfoMapValue} extends {@link TeaModel}
 *
 * <p>ModuleAgentInfoAttributeShowInfoMapValue</p>
 */
public class ModuleAgentInfoAttributeShowInfoMapValue extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("name")
    private String name;

    @NameInMap("text")
    private String text;

    private ModuleAgentInfoAttributeShowInfoMapValue(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleAgentInfoAttributeShowInfoMapValue create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder {
        private String code; 
        private String name; 
        private String text; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public ModuleAgentInfoAttributeShowInfoMapValue build() {
            return new ModuleAgentInfoAttributeShowInfoMapValue(this);
        } 

    } 

}

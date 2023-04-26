// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDefaultAITemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetDefaultAITemplateResponseBody</p>
 */
public class GetDefaultAITemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateInfo")
    private TemplateInfo templateInfo;

    private GetDefaultAITemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateInfo = builder.templateInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefaultAITemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateInfo
     */
    public TemplateInfo getTemplateInfo() {
        return this.templateInfo;
    }

    public static final class Builder {
        private String requestId; 
        private TemplateInfo templateInfo; 

        /**
         * The information about the AI template.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the AI template.
         */
        public Builder templateInfo(TemplateInfo templateInfo) {
            this.templateInfo = templateInfo;
            return this;
        }

        public GetDefaultAITemplateResponseBody build() {
            return new GetDefaultAITemplateResponseBody(this);
        } 

    } 

    public static class TemplateInfo extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("IsDefault")
        private String isDefault;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Source")
        private String source;

        @NameInMap("TemplateConfig")
        private String templateConfig;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateType")
        private String templateType;

        private TemplateInfo(Builder builder) {
            this.creationTime = builder.creationTime;
            this.isDefault = builder.isDefault;
            this.modifyTime = builder.modifyTime;
            this.source = builder.source;
            this.templateConfig = builder.templateConfig;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateInfo create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return templateConfig
         */
        public String getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String creationTime; 
            private String isDefault; 
            private String modifyTime; 
            private String source; 
            private String templateConfig; 
            private String templateId; 
            private String templateName; 
            private String templateType; 

            /**
             * The type of the AI template. The value is **AIMediaAudit**, which indicates automated review.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The time when the AI template was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Queries information about the default AI template.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The time when the AI template was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder templateConfig(String templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * Indicates whether the template is the default AI template. Valid values:
             * <p>
             * 
             * *   **Default**
             * *   **NotDefault**
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public TemplateInfo build() {
                return new TemplateInfo(this);
            } 

        } 

    }
}

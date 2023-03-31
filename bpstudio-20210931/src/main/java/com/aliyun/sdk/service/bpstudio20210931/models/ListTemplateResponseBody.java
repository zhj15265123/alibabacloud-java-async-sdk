// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplateResponseBody</p>
 */
public class ListTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details about templates.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTemplateResponseBody build() {
            return new ListTemplateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ImageURL")
        private String imageURL;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("TagId")
        private Integer tagId;

        @NameInMap("TagName")
        private String tagName;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TopoURL")
        private String topoURL;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.imageURL = builder.imageURL;
            this.name = builder.name;
            this.resourceGroupId = builder.resourceGroupId;
            this.tagId = builder.tagId;
            this.tagName = builder.tagName;
            this.templateId = builder.templateId;
            this.topoURL = builder.topoURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return imageURL
         */
        public String getImageURL() {
            return this.imageURL;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tagId
         */
        public Integer getTagId() {
            return this.tagId;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return topoURL
         */
        public String getTopoURL() {
            return this.topoURL;
        }

        public static final class Builder {
            private String createTime; 
            private String imageURL; 
            private String name; 
            private String resourceGroupId; 
            private Integer tagId; 
            private String tagName; 
            private String templateId; 
            private String topoURL; 

            /**
             * The time when the template was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The URL of the architecture image.
             */
            public Builder imageURL(String imageURL) {
                this.imageURL = imageURL;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the tag that is added to the template.
             */
            public Builder tagId(Integer tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * The name of the tag that is added to the template.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The URL of the template topology image.
             */
            public Builder topoURL(String topoURL) {
                this.topoURL = topoURL;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}

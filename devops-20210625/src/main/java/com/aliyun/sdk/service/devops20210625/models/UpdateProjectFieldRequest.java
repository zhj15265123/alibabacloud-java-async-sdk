// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProjectFieldRequest} extends {@link RequestModel}
 *
 * <p>UpdateProjectFieldRequest</p>
 */
public class UpdateProjectFieldRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("identifier")
    @Validation(required = true)
    private String identifier;

    @Body
    @NameInMap("statusIdentifier")
    private String statusIdentifier;

    @Body
    @NameInMap("updateBasicFieldRequestList")
    private java.util.List < UpdateBasicFieldRequestList> updateBasicFieldRequestList;

    @Body
    @NameInMap("updateForOpenApiList")
    private java.util.List < UpdateForOpenApiList> updateForOpenApiList;

    private UpdateProjectFieldRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.identifier = builder.identifier;
        this.statusIdentifier = builder.statusIdentifier;
        this.updateBasicFieldRequestList = builder.updateBasicFieldRequestList;
        this.updateForOpenApiList = builder.updateForOpenApiList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProjectFieldRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return statusIdentifier
     */
    public String getStatusIdentifier() {
        return this.statusIdentifier;
    }

    /**
     * @return updateBasicFieldRequestList
     */
    public java.util.List < UpdateBasicFieldRequestList> getUpdateBasicFieldRequestList() {
        return this.updateBasicFieldRequestList;
    }

    /**
     * @return updateForOpenApiList
     */
    public java.util.List < UpdateForOpenApiList> getUpdateForOpenApiList() {
        return this.updateForOpenApiList;
    }

    public static final class Builder extends Request.Builder<UpdateProjectFieldRequest, Builder> {
        private String organizationId; 
        private String identifier; 
        private String statusIdentifier; 
        private java.util.List < UpdateBasicFieldRequestList> updateBasicFieldRequestList; 
        private java.util.List < UpdateForOpenApiList> updateForOpenApiList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProjectFieldRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.identifier = request.identifier;
            this.statusIdentifier = request.statusIdentifier;
            this.updateBasicFieldRequestList = request.updateBasicFieldRequestList;
            this.updateForOpenApiList = request.updateForOpenApiList;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.putPathParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * statusIdentifier.
         */
        public Builder statusIdentifier(String statusIdentifier) {
            this.putBodyParameter("statusIdentifier", statusIdentifier);
            this.statusIdentifier = statusIdentifier;
            return this;
        }

        /**
         * updateBasicFieldRequestList.
         */
        public Builder updateBasicFieldRequestList(java.util.List < UpdateBasicFieldRequestList> updateBasicFieldRequestList) {
            this.putBodyParameter("updateBasicFieldRequestList", updateBasicFieldRequestList);
            this.updateBasicFieldRequestList = updateBasicFieldRequestList;
            return this;
        }

        /**
         * updateForOpenApiList.
         */
        public Builder updateForOpenApiList(java.util.List < UpdateForOpenApiList> updateForOpenApiList) {
            this.putBodyParameter("updateForOpenApiList", updateForOpenApiList);
            this.updateForOpenApiList = updateForOpenApiList;
            return this;
        }

        @Override
        public UpdateProjectFieldRequest build() {
            return new UpdateProjectFieldRequest(this);
        } 

    } 

    public static class UpdateBasicFieldRequestList extends TeaModel {
        @NameInMap("propertyKey")
        private String propertyKey;

        @NameInMap("propertyValue")
        private String propertyValue;

        private UpdateBasicFieldRequestList(Builder builder) {
            this.propertyKey = builder.propertyKey;
            this.propertyValue = builder.propertyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateBasicFieldRequestList create() {
            return builder().build();
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public static final class Builder {
            private String propertyKey; 
            private String propertyValue; 

            /**
             * propertyKey.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * propertyValue.
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            public UpdateBasicFieldRequestList build() {
                return new UpdateBasicFieldRequestList(this);
            } 

        } 

    }
    public static class UpdateForOpenApiList extends TeaModel {
        @NameInMap("fieldIdentifier")
        private String fieldIdentifier;

        @NameInMap("value")
        private String value;

        private UpdateForOpenApiList(Builder builder) {
            this.fieldIdentifier = builder.fieldIdentifier;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateForOpenApiList create() {
            return builder().build();
        }

        /**
         * @return fieldIdentifier
         */
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String fieldIdentifier; 
            private String value; 

            /**
             * fieldIdentifier.
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UpdateForOpenApiList build() {
                return new UpdateForOpenApiList(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePropertyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePropertyResponseBody</p>
 */
public class UpdatePropertyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UpdateResult")
    private UpdateResult updateResult;

    private UpdatePropertyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.updateResult = builder.updateResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePropertyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateResult
     */
    public UpdateResult getUpdateResult() {
        return this.updateResult;
    }

    public static final class Builder {
        private String requestId; 
        private UpdateResult updateResult; 

        /**
         * The name of the property.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the property.
         */
        public Builder updateResult(UpdateResult updateResult) {
            this.updateResult = updateResult;
            return this;
        }

        public UpdatePropertyResponseBody build() {
            return new UpdatePropertyResponseBody(this);
        } 

    } 

    public static class FailedPropertyValues extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("PropertyId")
        private Long propertyId;

        @NameInMap("PropertyValue")
        private String propertyValue;

        private FailedPropertyValues(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.propertyId = builder.propertyId;
            this.propertyValue = builder.propertyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedPropertyValues create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return propertyId
         */
        public Long getPropertyId() {
            return this.propertyId;
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private Long propertyId; 
            private String propertyValue; 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * PropertyId.
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * PropertyValue.
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            public FailedPropertyValues build() {
                return new FailedPropertyValues(this);
            } 

        } 

    }
    public static class SavePropertyValues extends TeaModel {
        @NameInMap("PropertyValue")
        private String propertyValue;

        @NameInMap("PropertyValueId")
        private Long propertyValueId;

        private SavePropertyValues(Builder builder) {
            this.propertyValue = builder.propertyValue;
            this.propertyValueId = builder.propertyValueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SavePropertyValues create() {
            return builder().build();
        }

        /**
         * @return propertyValue
         */
        public String getPropertyValue() {
            return this.propertyValue;
        }

        /**
         * @return propertyValueId
         */
        public Long getPropertyValueId() {
            return this.propertyValueId;
        }

        public static final class Builder {
            private String propertyValue; 
            private Long propertyValueId; 

            /**
             * Modifies a user property.
             */
            public Builder propertyValue(String propertyValue) {
                this.propertyValue = propertyValue;
                return this;
            }

            /**
             * The value of the property.
             */
            public Builder propertyValueId(Long propertyValueId) {
                this.propertyValueId = propertyValueId;
                return this;
            }

            public SavePropertyValues build() {
                return new SavePropertyValues(this);
            } 

        } 

    }
    public static class SavePropertyValueModel extends TeaModel {
        @NameInMap("FailedPropertyValues")
        private java.util.List < FailedPropertyValues> failedPropertyValues;

        @NameInMap("SavePropertyValues")
        private java.util.List < SavePropertyValues> savePropertyValues;

        private SavePropertyValueModel(Builder builder) {
            this.failedPropertyValues = builder.failedPropertyValues;
            this.savePropertyValues = builder.savePropertyValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SavePropertyValueModel create() {
            return builder().build();
        }

        /**
         * @return failedPropertyValues
         */
        public java.util.List < FailedPropertyValues> getFailedPropertyValues() {
            return this.failedPropertyValues;
        }

        /**
         * @return savePropertyValues
         */
        public java.util.List < SavePropertyValues> getSavePropertyValues() {
            return this.savePropertyValues;
        }

        public static final class Builder {
            private java.util.List < FailedPropertyValues> failedPropertyValues; 
            private java.util.List < SavePropertyValues> savePropertyValues; 

            /**
             * UpdateProperty
             */
            public Builder failedPropertyValues(java.util.List < FailedPropertyValues> failedPropertyValues) {
                this.failedPropertyValues = failedPropertyValues;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder savePropertyValues(java.util.List < SavePropertyValues> savePropertyValues) {
                this.savePropertyValues = savePropertyValues;
                return this;
            }

            public SavePropertyValueModel build() {
                return new SavePropertyValueModel(this);
            } 

        } 

    }
    public static class UpdateResult extends TeaModel {
        @NameInMap("PropertyId")
        private Long propertyId;

        @NameInMap("PropertyKey")
        private String propertyKey;

        @NameInMap("SavePropertyValueModel")
        private SavePropertyValueModel savePropertyValueModel;

        private UpdateResult(Builder builder) {
            this.propertyId = builder.propertyId;
            this.propertyKey = builder.propertyKey;
            this.savePropertyValueModel = builder.savePropertyValueModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateResult create() {
            return builder().build();
        }

        /**
         * @return propertyId
         */
        public Long getPropertyId() {
            return this.propertyId;
        }

        /**
         * @return propertyKey
         */
        public String getPropertyKey() {
            return this.propertyKey;
        }

        /**
         * @return savePropertyValueModel
         */
        public SavePropertyValueModel getSavePropertyValueModel() {
            return this.savePropertyValueModel;
        }

        public static final class Builder {
            private Long propertyId; 
            private String propertyKey; 
            private SavePropertyValueModel savePropertyValueModel; 

            /**
             * The ID of the property.
             */
            public Builder propertyId(Long propertyId) {
                this.propertyId = propertyId;
                return this;
            }

            /**
             * The ID of property value N that you want to modify. You can call the [ListProperty](~~410890~~) operation to query the property value ID.
             */
            public Builder propertyKey(String propertyKey) {
                this.propertyKey = propertyKey;
                return this;
            }

            /**
             * The property values that were modified.
             */
            public Builder savePropertyValueModel(SavePropertyValueModel savePropertyValueModel) {
                this.savePropertyValueModel = savePropertyValueModel;
                return this;
            }

            public UpdateResult build() {
                return new UpdateResult(this);
            } 

        } 

    }
}

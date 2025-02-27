// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerGroupRequest</p>
 */
public class CreateConsumerGroupRequest extends Request {
    @Query
    @NameInMap("ConsumerId")
    @Validation(required = true)
    private String consumerId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateConsumerGroupRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateConsumerGroupRequest, Builder> {
        private String consumerId; 
        private String instanceId; 
        private String regionId; 
        private String remark; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerGroupRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.tag = request.tag;
        } 

        /**
         * The name of the consumer group.
         * <p>
         * 
         * *   The value can contain only letters, digits, hyphens (-), and underscores (\_), and the value must contain at least one letter or digit.
         * *   The value must be 3 to 128 characters in length. If the value that you specify contains more than 128 characters, the system automatically truncates the value to 128 characters.
         * *   After a consumer group is created, you cannot change the name of the consumer group.
         */
        public Builder consumerId(String consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The description of the consumer group.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateConsumerGroupRequest build() {
            return new CreateConsumerGroupRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N.
             * <p>
             * 
             * *   Valid values of N: 1 to 20.
             * *   You must specify this parameter.
             * *   The tag key can be up to 128 characters in length and cannot contain [http:// or https://](http://https://。). The tag key cannot start with acs: or aliyun.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N.
             * <p>
             * 
             * *   Valid values of N: 1 to 20.
             * *   You can leave this parameter empty.
             * *   The tag value can be 1 to 128 characters in length and cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryModifyInstancePriceRequest} extends {@link RequestModel}
 *
 * <p>QueryModifyInstancePriceRequest</p>
 */
public class QueryModifyInstancePriceRequest extends Request {
    @Body
    @NameInMap("ModifyPrepayInstanceSpecRequest")
    @Validation(required = true)
    private ModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest;

    private QueryModifyInstancePriceRequest(Builder builder) {
        super(builder);
        this.modifyPrepayInstanceSpecRequest = builder.modifyPrepayInstanceSpecRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryModifyInstancePriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifyPrepayInstanceSpecRequest
     */
    public ModifyPrepayInstanceSpecRequest getModifyPrepayInstanceSpecRequest() {
        return this.modifyPrepayInstanceSpecRequest;
    }

    public static final class Builder extends Request.Builder<QueryModifyInstancePriceRequest, Builder> {
        private ModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest; 

        private Builder() {
            super();
        } 

        private Builder(QueryModifyInstancePriceRequest request) {
            super(request);
            this.modifyPrepayInstanceSpecRequest = request.modifyPrepayInstanceSpecRequest;
        } 

        /**
         * ModifyPrepayInstanceSpecRequest.
         */
        public Builder modifyPrepayInstanceSpecRequest(ModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest) {
            this.putBodyParameter("ModifyPrepayInstanceSpecRequest", modifyPrepayInstanceSpecRequest);
            this.modifyPrepayInstanceSpecRequest = modifyPrepayInstanceSpecRequest;
            return this;
        }

        @Override
        public QueryModifyInstancePriceRequest build() {
            return new QueryModifyInstancePriceRequest(this);
        } 

    } 

    public static class ResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        @Validation(required = true)
        private Integer cpu;

        @NameInMap("MemoryGB")
        @Validation(required = true)
        private Integer memoryGB;

        private ResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    public static class ModifyPrepayInstanceSpecRequest extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("Region")
        @Validation(required = true)
        private String region;

        @NameInMap("ResourceSpec")
        @Validation(required = true)
        private ResourceSpec resourceSpec;

        private ModifyPrepayInstanceSpecRequest(Builder builder) {
            this.instanceId = builder.instanceId;
            this.region = builder.region;
            this.resourceSpec = builder.resourceSpec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyPrepayInstanceSpecRequest create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return resourceSpec
         */
        public ResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public static final class Builder {
            private String instanceId; 
            private String region; 
            private ResourceSpec resourceSpec; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            public ModifyPrepayInstanceSpecRequest build() {
                return new ModifyPrepayInstanceSpecRequest(this);
            } 

        } 

    }
}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBasicEndpointsRequest} extends {@link RequestModel}
 *
 * <p>CreateBasicEndpointsRequest</p>
 */
public class CreateBasicEndpointsRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

    @Query
    @NameInMap("Endpoints")
    @Validation(required = true)
    private java.util.List < Endpoints> endpoints;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateBasicEndpointsRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpoints = builder.endpoints;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBasicEndpointsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateBasicEndpointsRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private String endpointGroupId; 
        private java.util.List < Endpoints> endpoints; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateBasicEndpointsRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.endpointGroupId = request.endpointGroupId;
            this.endpoints = request.endpoints;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the basic GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The endpoints in the endpoint group.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.putQueryParameter("Endpoints", endpoints);
            this.endpoints = endpoints;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateBasicEndpointsRequest build() {
            return new CreateBasicEndpointsRequest(this);
        } 

    } 

    public static class Endpoints extends TeaModel {
        @NameInMap("EndpointAddress")
        private String endpointAddress;

        @NameInMap("EndpointSubAddress")
        private String endpointSubAddress;

        @NameInMap("EndpointSubAddressType")
        private String endpointSubAddressType;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("EndpointZoneId")
        private String endpointZoneId;

        @NameInMap("Name")
        private String name;

        private Endpoints(Builder builder) {
            this.endpointAddress = builder.endpointAddress;
            this.endpointSubAddress = builder.endpointSubAddress;
            this.endpointSubAddressType = builder.endpointSubAddressType;
            this.endpointType = builder.endpointType;
            this.endpointZoneId = builder.endpointZoneId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return endpointAddress
         */
        public String getEndpointAddress() {
            return this.endpointAddress;
        }

        /**
         * @return endpointSubAddress
         */
        public String getEndpointSubAddress() {
            return this.endpointSubAddress;
        }

        /**
         * @return endpointSubAddressType
         */
        public String getEndpointSubAddressType() {
            return this.endpointSubAddressType;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return endpointZoneId
         */
        public String getEndpointZoneId() {
            return this.endpointZoneId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String endpointAddress; 
            private String endpointSubAddress; 
            private String endpointSubAddressType; 
            private String endpointType; 
            private String endpointZoneId; 
            private String name; 

            /**
             * The address of the endpoint.
             */
            public Builder endpointAddress(String endpointAddress) {
                this.endpointAddress = endpointAddress;
                return this;
            }

            /**
             * The secondary address of the endpoint.
             * <p>
             * 
             * This parameter is required if the endpoint type is **ECS**, **ENI**, or **NLB**.
             * 
             * *   If the endpoint type is **ECS**, you can set the **EndpointSubAddress** parameter to the secondary private IP address of the primary ENI. If the parameter is left empty, the primary private IP address of the primary ENI is used.
             * *   If the endpoint type is **ENI**, you can set the **EndpointSubAddress** parameter to the secondary private IP address of the secondary ENI. If the parameter is left empty, the primary private IP address of the secondary ENI is used.
             * *   This parameter is required if the endpoint type is **NLB**. **EndpointSubAddress** is the primary private IP address of the NLB backend server.
             */
            public Builder endpointSubAddress(String endpointSubAddress) {
                this.endpointSubAddress = endpointSubAddress;
                return this;
            }

            /**
             * The secondary address type of the endpoint. Valid values:
             * <p>
             * 
             * *   **primary:** a primary private IP address.
             * *   **secondary:** a secondary private IP address.
             * 
             * This parameter is required if the endpoint type is **ECS**, **ENI**, or **NLB**. If the endpoint type is **NLB**, only **primary** is supported.
             */
            public Builder endpointSubAddressType(String endpointSubAddressType) {
                this.endpointSubAddressType = endpointSubAddressType;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **ENI:** elastic network interface (ENI).
             * *   **SLB:** Classic Load Balancer (CLB) instance.
             * *   **ECS:** Elastic Compute Service (ECS) instance.
             * *   **NLB:** Network Load Balancer (NLB) instance.
             * 
             * >  This parameter is required.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The ID of the zone where the endpoint resides.
             * <p>
             * 
             * This parameter is required only if the endpoint type is **NLB**.
             */
            public Builder endpointZoneId(String endpointZoneId) {
                this.endpointZoneId = endpointZoneId;
                return this;
            }

            /**
             * The name of the endpoint.
             * <p>
             * 
             * The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}

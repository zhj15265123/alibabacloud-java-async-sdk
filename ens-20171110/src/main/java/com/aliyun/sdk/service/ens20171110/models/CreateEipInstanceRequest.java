// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEipInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateEipInstanceRequest</p>
 */
public class CreateEipInstanceRequest extends Request {
    @Query
    @NameInMap("Bandwidth")
    @Validation(maximum = 10000, minimum = 5)
    private Long bandwidth;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("InstanceChargeType")
    @Validation(required = true)
    private String instanceChargeType;

    @Query
    @NameInMap("InternetChargeType")
    @Validation(required = true)
    private String internetChargeType;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("Name")
    private String name;

    private CreateEipInstanceRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.ensRegionId = builder.ensRegionId;
        this.instanceChargeType = builder.instanceChargeType;
        this.internetChargeType = builder.internetChargeType;
        this.isp = builder.isp;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEipInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreateEipInstanceRequest, Builder> {
        private Long bandwidth; 
        private String ensRegionId; 
        private String instanceChargeType; 
        private String internetChargeType; 
        private String isp; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateEipInstanceRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.ensRegionId = request.ensRegionId;
            this.instanceChargeType = request.instanceChargeType;
            this.internetChargeType = request.internetChargeType;
            this.isp = request.isp;
            this.name = request.name;
        } 

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateEipInstanceRequest build() {
            return new CreateEipInstanceRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateNonceRequest} extends {@link RequestModel}
 *
 * <p>GenerateNonceRequest</p>
 */
public class GenerateNonceRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AikName")
    @Validation(required = true)
    private String aikName;

    @Query
    @NameInMap("EkCert")
    private String ekCert;

    @Query
    @NameInMap("EkPub")
    private String ekPub;

    @Query
    @NameInMap("PropertyUuid")
    @Validation(required = true)
    private String propertyUuid;

    private GenerateNonceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aikName = builder.aikName;
        this.ekCert = builder.ekCert;
        this.ekPub = builder.ekPub;
        this.propertyUuid = builder.propertyUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateNonceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return aikName
     */
    public String getAikName() {
        return this.aikName;
    }

    /**
     * @return ekCert
     */
    public String getEkCert() {
        return this.ekCert;
    }

    /**
     * @return ekPub
     */
    public String getEkPub() {
        return this.ekPub;
    }

    /**
     * @return propertyUuid
     */
    public String getPropertyUuid() {
        return this.propertyUuid;
    }

    public static final class Builder extends Request.Builder<GenerateNonceRequest, Builder> {
        private String regionId; 
        private String aikName; 
        private String ekCert; 
        private String ekPub; 
        private String propertyUuid; 

        private Builder() {
            super();
        } 

        private Builder(GenerateNonceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aikName = request.aikName;
            this.ekCert = request.ekCert;
            this.ekPub = request.ekPub;
            this.propertyUuid = request.propertyUuid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AikName.
         */
        public Builder aikName(String aikName) {
            this.putQueryParameter("AikName", aikName);
            this.aikName = aikName;
            return this;
        }

        /**
         * EkCert.
         */
        public Builder ekCert(String ekCert) {
            this.putQueryParameter("EkCert", ekCert);
            this.ekCert = ekCert;
            return this;
        }

        /**
         * EkPub.
         */
        public Builder ekPub(String ekPub) {
            this.putQueryParameter("EkPub", ekPub);
            this.ekPub = ekPub;
            return this;
        }

        /**
         * PropertyUuid.
         */
        public Builder propertyUuid(String propertyUuid) {
            this.putQueryParameter("PropertyUuid", propertyUuid);
            this.propertyUuid = propertyUuid;
            return this;
        }

        @Override
        public GenerateNonceRequest build() {
            return new GenerateNonceRequest(this);
        } 

    } 

}

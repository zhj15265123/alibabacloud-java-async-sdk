// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFileDeploymentRequest} extends {@link RequestModel}
 *
 * <p>CheckFileDeploymentRequest</p>
 */
public class CheckFileDeploymentRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("CheckDetailUrl")
    private String checkDetailUrl;

    @Body
    @NameInMap("CheckerInstanceId")
    @Validation(required = true)
    private String checkerInstanceId;

    @Body
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private CheckFileDeploymentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkDetailUrl = builder.checkDetailUrl;
        this.checkerInstanceId = builder.checkerInstanceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckFileDeploymentRequest create() {
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
     * @return checkDetailUrl
     */
    public String getCheckDetailUrl() {
        return this.checkDetailUrl;
    }

    /**
     * @return checkerInstanceId
     */
    public String getCheckerInstanceId() {
        return this.checkerInstanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<CheckFileDeploymentRequest, Builder> {
        private String regionId; 
        private String checkDetailUrl; 
        private String checkerInstanceId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(CheckFileDeploymentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkDetailUrl = request.checkDetailUrl;
            this.checkerInstanceId = request.checkerInstanceId;
            this.status = request.status;
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
         * CheckDetailUrl.
         */
        public Builder checkDetailUrl(String checkDetailUrl) {
            this.putBodyParameter("CheckDetailUrl", checkDetailUrl);
            this.checkDetailUrl = checkDetailUrl;
            return this;
        }

        /**
         * CheckerInstanceId.
         */
        public Builder checkerInstanceId(String checkerInstanceId) {
            this.putBodyParameter("CheckerInstanceId", checkerInstanceId);
            this.checkerInstanceId = checkerInstanceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public CheckFileDeploymentRequest build() {
            return new CheckFileDeploymentRequest(this);
        } 

    } 

}

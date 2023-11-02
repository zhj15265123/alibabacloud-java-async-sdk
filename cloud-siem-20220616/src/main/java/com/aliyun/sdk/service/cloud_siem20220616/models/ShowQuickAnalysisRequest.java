// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShowQuickAnalysisRequest} extends {@link RequestModel}
 *
 * <p>ShowQuickAnalysisRequest</p>
 */
public class ShowQuickAnalysisRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    private ShowQuickAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShowQuickAnalysisRequest create() {
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

    public static final class Builder extends Request.Builder<ShowQuickAnalysisRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ShowQuickAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ShowQuickAnalysisRequest build() {
            return new ShowQuickAnalysisRequest(this);
        } 

    } 

}

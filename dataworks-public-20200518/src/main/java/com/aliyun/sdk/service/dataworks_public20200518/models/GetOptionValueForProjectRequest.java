// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOptionValueForProjectRequest} extends {@link RequestModel}
 *
 * <p>GetOptionValueForProjectRequest</p>
 */
public class GetOptionValueForProjectRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ExtensionCode")
    private String extensionCode;

    @Body
    @NameInMap("ProjectId")
    private String projectId;

    private GetOptionValueForProjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.extensionCode = builder.extensionCode;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOptionValueForProjectRequest create() {
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
     * @return extensionCode
     */
    public String getExtensionCode() {
        return this.extensionCode;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetOptionValueForProjectRequest, Builder> {
        private String regionId; 
        private String extensionCode; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetOptionValueForProjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.extensionCode = request.extensionCode;
            this.projectId = request.projectId;
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
         * ExtensionCode.
         */
        public Builder extensionCode(String extensionCode) {
            this.putBodyParameter("ExtensionCode", extensionCode);
            this.extensionCode = extensionCode;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetOptionValueForProjectRequest build() {
            return new GetOptionValueForProjectRequest(this);
        } 

    } 

}

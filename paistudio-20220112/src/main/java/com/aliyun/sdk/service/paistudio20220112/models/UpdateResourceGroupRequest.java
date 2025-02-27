// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceGroupRequest</p>
 */
public class UpdateResourceGroupRequest extends Request {
    @Path
    @NameInMap("ResourceGroupID")
    private String resourceGroupID;

    @Body
    @NameInMap("Unbind")
    private Boolean unbind;

    @Body
    @NameInMap("UserVpc")
    private UserVpc userVpc;

    private UpdateResourceGroupRequest(Builder builder) {
        super(builder);
        this.resourceGroupID = builder.resourceGroupID;
        this.unbind = builder.unbind;
        this.userVpc = builder.userVpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceGroupID
     */
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    /**
     * @return unbind
     */
    public Boolean getUnbind() {
        return this.unbind;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static final class Builder extends Request.Builder<UpdateResourceGroupRequest, Builder> {
        private String resourceGroupID; 
        private Boolean unbind; 
        private UserVpc userVpc; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceGroupRequest request) {
            super(request);
            this.resourceGroupID = request.resourceGroupID;
            this.unbind = request.unbind;
            this.userVpc = request.userVpc;
        } 

        /**
         * ResourceGroupID.
         */
        public Builder resourceGroupID(String resourceGroupID) {
            this.putPathParameter("ResourceGroupID", resourceGroupID);
            this.resourceGroupID = resourceGroupID;
            return this;
        }

        /**
         * Unbind.
         */
        public Builder unbind(Boolean unbind) {
            this.putBodyParameter("Unbind", unbind);
            this.unbind = unbind;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        @Override
        public UpdateResourceGroupRequest build() {
            return new UpdateResourceGroupRequest(this);
        } 

    } 

}

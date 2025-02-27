// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPermissionRequest} extends {@link RequestModel}
 *
 * <p>GetPermissionRequest</p>
 */
public class GetPermissionRequest extends Request {
    @Path
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    @Path
    @NameInMap("PermissionCode")
    @Validation(required = true)
    private String permissionCode;

    @Query
    @NameInMap("Accessibility")
    private String accessibility;

    @Query
    @NameInMap("Creator")
    private String creator;

    private GetPermissionRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.permissionCode = builder.permissionCode;
        this.accessibility = builder.accessibility;
        this.creator = builder.creator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return permissionCode
     */
    public String getPermissionCode() {
        return this.permissionCode;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    public static final class Builder extends Request.Builder<GetPermissionRequest, Builder> {
        private String workspaceId; 
        private String permissionCode; 
        private String accessibility; 
        private String creator; 

        private Builder() {
            super();
        } 

        private Builder(GetPermissionRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.permissionCode = request.permissionCode;
            this.accessibility = request.accessibility;
            this.creator = request.creator;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * PermissionCode.
         */
        public Builder permissionCode(String permissionCode) {
            this.putPathParameter("PermissionCode", permissionCode);
            this.permissionCode = permissionCode;
            return this;
        }

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.putQueryParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        @Override
        public GetPermissionRequest build() {
            return new GetPermissionRequest(this);
        } 

    } 

}

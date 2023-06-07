// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNamespacesRequest} extends {@link RequestModel}
 *
 * <p>ListNamespacesRequest</p>
 */
public class ListNamespacesRequest extends Request {
    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListNamespacesRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.namespaceName = builder.namespaceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespacesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListNamespacesRequest, Builder> {
        private String namespace; 
        private String namespaceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListNamespacesRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.namespaceName = request.namespaceName;
            this.regionId = request.regionId;
        } 

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListNamespacesRequest build() {
            return new ListNamespacesRequest(this);
        } 

    } 

}

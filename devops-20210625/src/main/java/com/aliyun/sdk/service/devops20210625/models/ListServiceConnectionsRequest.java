// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceConnectionsRequest} extends {@link RequestModel}
 *
 * <p>ListServiceConnectionsRequest</p>
 */
public class ListServiceConnectionsRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("sericeConnectionType")
    @Validation(required = true)
    private String sericeConnectionType;

    private ListServiceConnectionsRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.sericeConnectionType = builder.sericeConnectionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceConnectionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return sericeConnectionType
     */
    public String getSericeConnectionType() {
        return this.sericeConnectionType;
    }

    public static final class Builder extends Request.Builder<ListServiceConnectionsRequest, Builder> {
        private String organizationId; 
        private String sericeConnectionType; 

        private Builder() {
            super();
        } 

        private Builder(ListServiceConnectionsRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.sericeConnectionType = request.sericeConnectionType;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * sericeConnectionType.
         */
        public Builder sericeConnectionType(String sericeConnectionType) {
            this.putQueryParameter("sericeConnectionType", sericeConnectionType);
            this.sericeConnectionType = sericeConnectionType;
            return this;
        }

        @Override
        public ListServiceConnectionsRequest build() {
            return new ListServiceConnectionsRequest(this);
        } 

    } 

}

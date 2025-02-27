// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceSchemasRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourceSchemasRequest</p>
 */
public class ListDataSourceSchemasRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("dataSourceName")
    @Validation(required = true)
    private String dataSourceName;

    private ListDataSourceSchemasRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceSchemasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public static final class Builder extends Request.Builder<ListDataSourceSchemasRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourceSchemasRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * dataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        @Override
        public ListDataSourceSchemasRequest build() {
            return new ListDataSourceSchemasRequest(this);
        } 

    } 

}

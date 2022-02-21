// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckConfigurationExportRequest} extends {@link RequestModel}
 *
 * <p>CheckConfigurationExportRequest</p>
 */
public class CheckConfigurationExportRequest extends Request {
    @Body
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Body
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    private CheckConfigurationExportRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckConfigurationExportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<CheckConfigurationExportRequest, Builder> {
        private String data; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(CheckConfigurationExportRequest response) {
            super(response);
            this.data = response.data;
            this.namespaceId = response.namespaceId;
        } 

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putBodyParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public CheckConfigurationExportRequest build() {
            return new CheckConfigurationExportRequest(this);
        } 

    } 

}

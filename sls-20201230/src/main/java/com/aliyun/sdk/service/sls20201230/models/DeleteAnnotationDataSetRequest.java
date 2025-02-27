// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link DeleteAnnotationDataSetRequest} extends {@link RequestModel}
 *
 * <p>DeleteAnnotationDataSetRequest</p>
 */
public class DeleteAnnotationDataSetRequest extends Request {
    @Path
    @NameInMap("datasetId")
    private String datasetId;

    private DeleteAnnotationDataSetRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAnnotationDataSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    public static final class Builder extends Request.Builder<DeleteAnnotationDataSetRequest, Builder> {
        private String datasetId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAnnotationDataSetRequest request) {
            super(request);
            this.datasetId = request.datasetId;
        } 

        /**
         * datasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("datasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        @Override
        public DeleteAnnotationDataSetRequest build() {
            return new DeleteAnnotationDataSetRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceTagsRequest} extends {@link RequestModel}
 *
 * <p>GetResourceTagsRequest</p>
 */
public class GetResourceTagsRequest extends Request {
    @Query
    @NameInMap("arn")
    @Validation(required = true)
    private String arn;

    private GetResourceTagsRequest(Builder builder) {
        super(builder);
        this.arn = builder.arn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    public static final class Builder extends Request.Builder<GetResourceTagsRequest, Builder> {
        private String arn; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceTagsRequest request) {
            super(request);
            this.arn = request.arn;
        } 

        /**
         * arn.
         */
        public Builder arn(String arn) {
            this.putQueryParameter("arn", arn);
            this.arn = arn;
            return this;
        }

        @Override
        public GetResourceTagsRequest build() {
            return new GetResourceTagsRequest(this);
        } 

    } 

}

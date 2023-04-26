// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAITemplateRequest} extends {@link RequestModel}
 *
 * <p>GetAITemplateRequest</p>
 */
public class GetAITemplateRequest extends Request {
    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private GetAITemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAITemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<GetAITemplateRequest, Builder> {
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(GetAITemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
        } 

        /**
         * The source of the AI template. Valid values:
         * <p>
         * 
         * *   **System**
         * *   **Custom**
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public GetAITemplateRequest build() {
            return new GetAITemplateRequest(this);
        } 

    } 

}

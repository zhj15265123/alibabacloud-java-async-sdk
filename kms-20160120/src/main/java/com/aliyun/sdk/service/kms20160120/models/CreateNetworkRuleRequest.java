// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkRuleRequest</p>
 */
public class CreateNetworkRuleRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("SourcePrivateIp")
    private String sourcePrivateIp;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateNetworkRuleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.sourcePrivateIp = builder.sourcePrivateIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourcePrivateIp
     */
    public String getSourcePrivateIp() {
        return this.sourcePrivateIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateNetworkRuleRequest, Builder> {
        private String description; 
        private String name; 
        private String sourcePrivateIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkRuleRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.sourcePrivateIp = request.sourcePrivateIp;
            this.type = request.type;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SourcePrivateIp.
         */
        public Builder sourcePrivateIp(String sourcePrivateIp) {
            this.putQueryParameter("SourcePrivateIp", sourcePrivateIp);
            this.sourcePrivateIp = sourcePrivateIp;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateNetworkRuleRequest build() {
            return new CreateNetworkRuleRequest(this);
        } 

    } 

}

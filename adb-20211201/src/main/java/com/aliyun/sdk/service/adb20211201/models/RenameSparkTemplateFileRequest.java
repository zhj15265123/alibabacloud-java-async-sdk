// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameSparkTemplateFileRequest} extends {@link RequestModel}
 *
 * <p>RenameSparkTemplateFileRequest</p>
 */
public class RenameSparkTemplateFileRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private RenameSparkTemplateFileRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameSparkTemplateFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<RenameSparkTemplateFileRequest, Builder> {
        private String DBClusterId; 
        private Long id; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(RenameSparkTemplateFileRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.id = request.id;
            this.name = request.name;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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

        @Override
        public RenameSparkTemplateFileRequest build() {
            return new RenameSparkTemplateFileRequest(this);
        } 

    } 

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceRequest</p>
 */
public class CreateDataSourceRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("autoBuildIndex")
    private Boolean autoBuildIndex;

    @Body
    @NameInMap("config")
    private Config config;

    @Body
    @NameInMap("domain")
    private String domain;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("saroConfig")
    private SaroConfig saroConfig;

    @Body
    @NameInMap("type")
    private String type;

    @Query
    @NameInMap("dryRun")
    private Boolean dryRun;

    private CreateDataSourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.autoBuildIndex = builder.autoBuildIndex;
        this.config = builder.config;
        this.domain = builder.domain;
        this.name = builder.name;
        this.saroConfig = builder.saroConfig;
        this.type = builder.type;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceRequest create() {
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
     * @return autoBuildIndex
     */
    public Boolean getAutoBuildIndex() {
        return this.autoBuildIndex;
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return saroConfig
     */
    public SaroConfig getSaroConfig() {
        return this.saroConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateDataSourceRequest, Builder> {
        private String instanceId; 
        private Boolean autoBuildIndex; 
        private Config config; 
        private String domain; 
        private String name; 
        private SaroConfig saroConfig; 
        private String type; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.autoBuildIndex = request.autoBuildIndex;
            this.config = request.config;
            this.domain = request.domain;
            this.name = request.name;
            this.saroConfig = request.saroConfig;
            this.type = request.type;
            this.dryRun = request.dryRun;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * autoBuildIndex.
         */
        public Builder autoBuildIndex(Boolean autoBuildIndex) {
            this.putBodyParameter("autoBuildIndex", autoBuildIndex);
            this.autoBuildIndex = autoBuildIndex;
            return this;
        }

        /**
         * config.
         */
        public Builder config(Config config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * saroConfig.
         */
        public Builder saroConfig(SaroConfig saroConfig) {
            this.putBodyParameter("saroConfig", saroConfig);
            this.saroConfig = saroConfig;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. This parameter is only used to check whether the data source is valid. Valid values: true and false.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateDataSourceRequest build() {
            return new CreateDataSourceRequest(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("accessKey")
        private String accessKey;

        @NameInMap("accessSecret")
        private String accessSecret;

        @NameInMap("bucket")
        private String bucket;

        @NameInMap("endpoint")
        private String endpoint;

        @NameInMap("namespace")
        private String namespace;

        @NameInMap("ossPath")
        private String ossPath;

        @NameInMap("partition")
        private String partition;

        @NameInMap("path")
        private String path;

        @NameInMap("project")
        private String project;

        @NameInMap("table")
        private String table;

        private Config(Builder builder) {
            this.accessKey = builder.accessKey;
            this.accessSecret = builder.accessSecret;
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.namespace = builder.namespace;
            this.ossPath = builder.ossPath;
            this.partition = builder.partition;
            this.path = builder.path;
            this.project = builder.project;
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return accessSecret
         */
        public String getAccessSecret() {
            return this.accessSecret;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return ossPath
         */
        public String getOssPath() {
            return this.ossPath;
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return table
         */
        public String getTable() {
            return this.table;
        }

        public static final class Builder {
            private String accessKey; 
            private String accessSecret; 
            private String bucket; 
            private String endpoint; 
            private String namespace; 
            private String ossPath; 
            private String partition; 
            private String path; 
            private String project; 
            private String table; 

            /**
             * accessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * accessSecret.
             */
            public Builder accessSecret(String accessSecret) {
                this.accessSecret = accessSecret;
                return this;
            }

            /**
             * bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ossPath.
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            /**
             * partition.
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * table.
             */
            public Builder table(String table) {
                this.table = table;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class SaroConfig extends TeaModel {
        @NameInMap("namespace")
        private String namespace;

        @NameInMap("tableName")
        private String tableName;

        private SaroConfig(Builder builder) {
            this.namespace = builder.namespace;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaroConfig create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String namespace; 
            private String tableName; 

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * tableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public SaroConfig build() {
                return new SaroConfig(this);
            } 

        } 

    }
}

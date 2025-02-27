// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIndexesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIndexesResponseBody</p>
 */
public class ListIndexesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListIndexesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * id of request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the indexes.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListIndexesResponseBody build() {
            return new ListIndexesResponseBody(this);
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
             * A parameter related to MaxCompute.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * A parameter related to SARO.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * A parameter related to OSS.
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
             * A parameter related to Apsara File Storage for HDFS.
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
             * A parameter related to SARO and MaxCompute.
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
             * A parameter related to SARO.
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
    public static class DataSourceInfo extends TeaModel {
        @NameInMap("autoBuildIndex")
        private Boolean autoBuildIndex;

        @NameInMap("config")
        private Config config;

        @NameInMap("domain")
        private String domain;

        @NameInMap("name")
        private String name;

        @NameInMap("processPartitionCount")
        private Integer processPartitionCount;

        @NameInMap("saroConfig")
        private SaroConfig saroConfig;

        @NameInMap("type")
        private String type;

        private DataSourceInfo(Builder builder) {
            this.autoBuildIndex = builder.autoBuildIndex;
            this.config = builder.config;
            this.domain = builder.domain;
            this.name = builder.name;
            this.processPartitionCount = builder.processPartitionCount;
            this.saroConfig = builder.saroConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceInfo create() {
            return builder().build();
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
         * @return processPartitionCount
         */
        public Integer getProcessPartitionCount() {
            return this.processPartitionCount;
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

        public static final class Builder {
            private Boolean autoBuildIndex; 
            private Config config; 
            private String domain; 
            private String name; 
            private Integer processPartitionCount; 
            private SaroConfig saroConfig; 
            private String type; 

            /**
             * Indicates whether the automatic full indexing feature is enabled.
             */
            public Builder autoBuildIndex(Boolean autoBuildIndex) {
                this.autoBuildIndex = autoBuildIndex;
                return this;
            }

            /**
             * The configuration of MaxCompute data sources.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * The offline deployment name of the data source.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of resources used for data update.
             */
            public Builder processPartitionCount(Integer processPartitionCount) {
                this.processPartitionCount = processPartitionCount;
                return this;
            }

            /**
             * The configuration of SARO data sources.
             */
            public Builder saroConfig(SaroConfig saroConfig) {
                this.saroConfig = saroConfig;
                return this;
            }

            /**
             * The type of the data source. Valid values: odps, swift, saro, oss, and unKnow.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSourceInfo build() {
                return new DataSourceInfo(this);
            } 

        } 

    }
    public static class Files extends TeaModel {
        @NameInMap("fullPathName")
        private String fullPathName;

        @NameInMap("isDir")
        private Boolean isDir;

        @NameInMap("isTemplate")
        private Boolean isTemplate;

        @NameInMap("name")
        private String name;

        private Files(Builder builder) {
            this.fullPathName = builder.fullPathName;
            this.isDir = builder.isDir;
            this.isTemplate = builder.isTemplate;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fullPathName
         */
        public String getFullPathName() {
            return this.fullPathName;
        }

        /**
         * @return isDir
         */
        public Boolean getIsDir() {
            return this.isDir;
        }

        /**
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String fullPathName; 
            private Boolean isDir; 
            private Boolean isTemplate; 
            private String name; 

            /**
             * The full path of the file.
             */
            public Builder fullPathName(String fullPathName) {
                this.fullPathName = fullPathName;
                return this;
            }

            /**
             * Indicates whether the file is a directory.
             */
            public Builder isDir(Boolean isDir) {
                this.isDir = isDir;
                return this;
            }

            /**
             * Indicates whether the file is a template.
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * The name of the file.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
    public static class Versions extends TeaModel {
        @NameInMap("desc")
        private String desc;

        @NameInMap("files")
        private java.util.List < Files> files;

        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private String status;

        @NameInMap("updateTime")
        private Long updateTime;

        @NameInMap("versionId")
        private Integer versionId;

        private Versions(Builder builder) {
            this.desc = builder.desc;
            this.files = builder.files;
            this.name = builder.name;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return files
         */
        public java.util.List < Files> getFiles() {
            return this.files;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return versionId
         */
        public Integer getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List < Files> files; 
            private String name; 
            private String status; 
            private Long updateTime; 
            private Integer versionId; 

            /**
             * The description of the version.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The information about the files.
             */
            public Builder files(java.util.List < Files> files) {
                this.files = files;
                return this;
            }

            /**
             * The name of the version.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the version. Valid values: drafting, used, unused, and trash.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The last time when the version was updated.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the version. The value is null for an edit version.
             */
            public Builder versionId(Integer versionId) {
                this.versionId = versionId;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("dataSource")
        private String dataSource;

        @NameInMap("dataSourceInfo")
        private DataSourceInfo dataSourceInfo;

        @NameInMap("description")
        private String description;

        @NameInMap("domain")
        private String domain;

        @NameInMap("fullUpdateTime")
        private String fullUpdateTime;

        @NameInMap("fullVersion")
        private Long fullVersion;

        @NameInMap("incUpdateTime")
        private String incUpdateTime;

        @NameInMap("indexSize")
        private Long indexSize;

        @NameInMap("indexStatus")
        private String indexStatus;

        @NameInMap("name")
        private String name;

        @NameInMap("partition")
        private Integer partition;

        @NameInMap("versions")
        private java.util.List < Versions> versions;

        private Result(Builder builder) {
            this.content = builder.content;
            this.dataSource = builder.dataSource;
            this.dataSourceInfo = builder.dataSourceInfo;
            this.description = builder.description;
            this.domain = builder.domain;
            this.fullUpdateTime = builder.fullUpdateTime;
            this.fullVersion = builder.fullVersion;
            this.incUpdateTime = builder.incUpdateTime;
            this.indexSize = builder.indexSize;
            this.indexStatus = builder.indexStatus;
            this.name = builder.name;
            this.partition = builder.partition;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return dataSourceInfo
         */
        public DataSourceInfo getDataSourceInfo() {
            return this.dataSourceInfo;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return fullUpdateTime
         */
        public String getFullUpdateTime() {
            return this.fullUpdateTime;
        }

        /**
         * @return fullVersion
         */
        public Long getFullVersion() {
            return this.fullVersion;
        }

        /**
         * @return incUpdateTime
         */
        public String getIncUpdateTime() {
            return this.incUpdateTime;
        }

        /**
         * @return indexSize
         */
        public Long getIndexSize() {
            return this.indexSize;
        }

        /**
         * @return indexStatus
         */
        public String getIndexStatus() {
            return this.indexStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partition
         */
        public Integer getPartition() {
            return this.partition;
        }

        /**
         * @return versions
         */
        public java.util.List < Versions> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String content; 
            private String dataSource; 
            private DataSourceInfo dataSourceInfo; 
            private String description; 
            private String domain; 
            private String fullUpdateTime; 
            private Long fullVersion; 
            private String incUpdateTime; 
            private Long indexSize; 
            private String indexStatus; 
            private String name; 
            private Integer partition; 
            private java.util.List < Versions> versions; 

            /**
             * The content of the index.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The data source.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * The information about the data source.
             */
            public Builder dataSourceInfo(DataSourceInfo dataSourceInfo) {
                this.dataSourceInfo = dataSourceInfo;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The deployment name of the index.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The last time when full data in the index was updated.
             */
            public Builder fullUpdateTime(String fullUpdateTime) {
                this.fullUpdateTime = fullUpdateTime;
                return this;
            }

            /**
             * The version of the data.
             */
            public Builder fullVersion(Long fullVersion) {
                this.fullVersion = fullVersion;
                return this;
            }

            /**
             * The last time when incremental data in the index was updated.
             */
            public Builder incUpdateTime(String incUpdateTime) {
                this.incUpdateTime = incUpdateTime;
                return this;
            }

            /**
             * The index size.
             */
            public Builder indexSize(Long indexSize) {
                this.indexSize = indexSize;
                return this;
            }

            /**
             * The status of the index. Valid values: NEW and PUBLISH.
             */
            public Builder indexStatus(String indexStatus) {
                this.indexStatus = indexStatus;
                return this;
            }

            /**
             * The name of the index.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of shards.
             */
            public Builder partition(Integer partition) {
                this.partition = partition;
                return this;
            }

            /**
             * The information about the versions.
             */
            public Builder versions(java.util.List < Versions> versions) {
                this.versions = versions;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}

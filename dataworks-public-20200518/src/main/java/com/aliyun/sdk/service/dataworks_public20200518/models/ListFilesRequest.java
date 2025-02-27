// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFilesRequest} extends {@link RequestModel}
 *
 * <p>ListFilesRequest</p>
 */
public class ListFilesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ExactFileName")
    private String exactFileName;

    @Body
    @NameInMap("FileFolderPath")
    private String fileFolderPath;

    @Body
    @NameInMap("FileIdIn")
    private String fileIdIn;

    @Body
    @NameInMap("FileTypes")
    private String fileTypes;

    @Body
    @NameInMap("Keyword")
    private String keyword;

    @Body
    @NameInMap("NeedAbsoluteFolderPath")
    private Boolean needAbsoluteFolderPath;

    @Body
    @NameInMap("NeedContent")
    private Boolean needContent;

    @Body
    @NameInMap("NodeId")
    private Long nodeId;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 100)
    private Integer pageSize;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @Body
    @NameInMap("UseType")
    private String useType;

    private ListFilesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.exactFileName = builder.exactFileName;
        this.fileFolderPath = builder.fileFolderPath;
        this.fileIdIn = builder.fileIdIn;
        this.fileTypes = builder.fileTypes;
        this.keyword = builder.keyword;
        this.needAbsoluteFolderPath = builder.needAbsoluteFolderPath;
        this.needContent = builder.needContent;
        this.nodeId = builder.nodeId;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.useType = builder.useType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return exactFileName
     */
    public String getExactFileName() {
        return this.exactFileName;
    }

    /**
     * @return fileFolderPath
     */
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    /**
     * @return fileIdIn
     */
    public String getFileIdIn() {
        return this.fileIdIn;
    }

    /**
     * @return fileTypes
     */
    public String getFileTypes() {
        return this.fileTypes;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return needAbsoluteFolderPath
     */
    public Boolean getNeedAbsoluteFolderPath() {
        return this.needAbsoluteFolderPath;
    }

    /**
     * @return needContent
     */
    public Boolean getNeedContent() {
        return this.needContent;
    }

    /**
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * @return useType
     */
    public String getUseType() {
        return this.useType;
    }

    public static final class Builder extends Request.Builder<ListFilesRequest, Builder> {
        private String regionId; 
        private String exactFileName; 
        private String fileFolderPath; 
        private String fileIdIn; 
        private String fileTypes; 
        private String keyword; 
        private Boolean needAbsoluteFolderPath; 
        private Boolean needContent; 
        private Long nodeId; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String projectIdentifier; 
        private String useType; 

        private Builder() {
            super();
        } 

        private Builder(ListFilesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.exactFileName = request.exactFileName;
            this.fileFolderPath = request.fileFolderPath;
            this.fileIdIn = request.fileIdIn;
            this.fileTypes = request.fileTypes;
            this.keyword = request.keyword;
            this.needAbsoluteFolderPath = request.needAbsoluteFolderPath;
            this.needContent = request.needContent;
            this.nodeId = request.nodeId;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.useType = request.useType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ExactFileName.
         */
        public Builder exactFileName(String exactFileName) {
            this.putBodyParameter("ExactFileName", exactFileName);
            this.exactFileName = exactFileName;
            return this;
        }

        /**
         * The path of the files.
         */
        public Builder fileFolderPath(String fileFolderPath) {
            this.putBodyParameter("FileFolderPath", fileFolderPath);
            this.fileFolderPath = fileFolderPath;
            return this;
        }

        /**
         * FileIdIn.
         */
        public Builder fileIdIn(String fileIdIn) {
            this.putBodyParameter("FileIdIn", fileIdIn);
            this.fileIdIn = fileIdIn;
            return this;
        }

        /**
         * The types of the code in the files.
         * <p>
         * 
         * Valid values: 6 (Shell), 10 (ODPS SQL), 11 (ODPS MR), 23 (Data Integration), 24 (ODPS Script), 97 (PAI), 98 (node group), 99 (zero load), 221 (PyODPS 2), 225 (ODPS Spark), 227 (EMR Hive), 228 (EMR Spark), 229 (EMR Spark SQL), 230 (EMR MR), 239 (OSS object inspection), 257 (EMR Shell), 258 (EMR Spark Shell), 259 (EMR Presto), 260 (EMR Impala), 900 (real-time synchronization), 1002 (PAI inner node), 1089 (cross-tenant collaboration), 1091 (Hologres development), 1093 (Hologres SQL), 1100 (assignment), 1106 (for-each), and 1221 (PyODPS 3).
         */
        public Builder fileTypes(String fileTypes) {
            this.putBodyParameter("FileTypes", fileTypes);
            this.fileTypes = fileTypes;
            return this;
        }

        /**
         * The keyword in the file names. The keyword is used to perform a fuzzy match. You can specify a keyword to query all files whose names contain the keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * NeedAbsoluteFolderPath.
         */
        public Builder needAbsoluteFolderPath(Boolean needAbsoluteFolderPath) {
            this.putBodyParameter("NeedAbsoluteFolderPath", needAbsoluteFolderPath);
            this.needAbsoluteFolderPath = needAbsoluteFolderPath;
            return this;
        }

        /**
         * NeedContent.
         */
        public Builder needContent(Boolean needContent) {
            this.putBodyParameter("NeedContent", needContent);
            this.needContent = needContent;
            return this;
        }

        /**
         * The ID of the node that is scheduled. You can call the [ListNodes](~~173979~~) operation to query the ID of the node.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The owner of the files.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.
         * <p>
         * 
         * You must configure either the ProjectId or ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace name.
         * <p>
         * 
         * You must configure either the ProjectId or ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * The module to which the files belong. Valid values:
         * <p>
         * 
         * *   NORMAL: The files are used for DataStudio.
         * *   MANUAL: The files are used for manually triggered nodes.
         * *   MANUAL_BIZ: The files are used for manually triggered workflows.
         * *   SKIP: The files are used for dry-run nodes in DataStudio.
         * *   ADHOCQUERY: The files are used for ad hoc queries.
         * *   COMPONENT: The files are used for snippets.
         */
        public Builder useType(String useType) {
            this.putBodyParameter("UseType", useType);
            this.useType = useType;
            return this;
        }

        @Override
        public ListFilesRequest build() {
            return new ListFilesRequest(this);
        } 

    } 

}

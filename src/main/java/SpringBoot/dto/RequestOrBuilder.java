// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Project.proto

package SpringBoot.dto;

public interface RequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:routeguide.Request)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 type_request = 1;</code>
     *
     * @return The typeRequest.
     */
    int getTypeRequest();

    /**
     * <code>int32 page = 2;</code>
     *
     * @return The page.
     */
    int getPage();

    /**
     * <code>int32 max_item_in_page = 3;</code>
     *
     * @return The maxItemInPage.
     */
    int getMaxItemInPage();

    /**
     * <code>string search = 4;</code>
     *
     * @return The search.
     */
    String getSearch();

    /**
     * <code>string search = 4;</code>
     *
     * @return The bytes for search.
     */
    com.google.protobuf.ByteString
    getSearchBytes();

    /**
     * <code>.routeguide.Project project = 5;</code>
     *
     * @return Whether the project field is set.
     */
    boolean hasProject();

    /**
     * <code>.routeguide.Project project = 5;</code>
     *
     * @return The project.
     */
    Project getProject();

    /**
     * <code>.routeguide.Project project = 5;</code>
     */
    ProjectOrBuilder getProjectOrBuilder();
}

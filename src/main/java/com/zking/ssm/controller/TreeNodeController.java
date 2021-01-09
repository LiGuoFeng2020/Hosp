package com.zking.ssm.controller;

import com.zking.ssm.model.TreeNode;
import com.zking.ssm.service.ITreeNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;

@Controller
@RequestMapping("/treenode")
public class TreeNodeController {

    @Autowired
    private ITreeNodeService treeNodeService;

    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(TreeNode treeNodes){
        List<TreeNode> listParent =new ArrayList<>();  //定义父菜单集合

      if(treeNodes.getParentNodeId()==null||new Integer(0).equals(treeNodes.getParentNodeId())){
          listParent = treeNodeService.listParent();
          System.out.println("父集合长度为："+listParent.size());
          for (TreeNode tn : listParent) {
              System.out.println("treeNode==="+tn);
              //定义子菜单集合
              List<TreeNode> listchildren  = treeNodeService.listchildren(tn.getTreeNodeId());
             for(TreeNode tc : listchildren){
                 tn.getChildren().add(tc);
             }
//              System.out.println("子集合长度为："+listchildren.size());
          }
      }
        Map<String,Object> map =new HashMap<>();
        map.put("result",listParent);
        return map;
    }



//    /**筛选父节点
//     * @param listNode
//     * @return
//     */
//    public List<TreeNode> listparent(List<TreeNode> listNode) {
//        List<TreeNode> list1 =new ArrayList<>();
//        List<TreeNode> list2 =new ArrayList<>();
////		将所有的父节点放入list1中
//        if(null!=listNode&&0!=listNode.size()) {
//            for (TreeNode tn : listNode) {
//                if(tn.getParentNodeId()==null) {
//                    list1.add(tn);
//                }
//            }
//            for (TreeNode tm1 : list1) {
//                if(null!=listNode&&0!=listNode.size()) {
//                    for (TreeNode tm2 : listNode) {
//                        if(tm2.getParentNodeId()!=null&&tm2.getParentNodeId()==tm1.getTreeNodeId()) {
//                            tm1.getChildren().add(tm2);
//                        }
//                    }
//                }
//            }
//        }
//        return list1;
//    }
//
//    //	将总集合放在方法外，找到对应的功能，将对应的节点全部放入
//    private List<TreeNode> list =new ArrayList<TreeNode>();
//
//    /**根据角色id查该角色的所有功能
//     * @param listnodes
//     * @param rid
//     * @return
//     */
//    public List<TreeNode> listbyId(List<TreeNode> listnodes, int rid) {
//        TreeNode tn;
//        if(null!=listnodes&&0!=listnodes.size()) {
//            for (TreeNode treeNode : listnodes) {
////				获取所有节点的子节点
//                List<Role> roles = treeNode.getRoles();
//                if(null!=roles&&0!=roles.size()) {
//                    for (Role role : roles) {
////						子节点的角色id等于传来的角色id就加入到总集合中
//                        if(role.getRoleid()==rid) {
//                            tn=new TreeNode();
//                            tn.setTreeNodeId(treeNode.getTreeNodeId());
//                            tn.setTreeNodeName(treeNode.getTreeNodeName());
//                            tn.setTreeNodeType(treeNode.getTreeNodeType());
//                            tn.setPosition(treeNode.getPosition());
//                            tn.setParentNodeId(treeNode.getParentNodeId());
//                            tn.setIcon(treeNode.getIcon());
//                            tn.setUrl(treeNode.getUrl());
//                            list.add(tn);
//                            break;
//                        }
//                    }
//                }
////				如果子集合集合不为空，则再次调用自己
//                if(null!=treeNode.getChildren()) {
//                    listbyId(treeNode.getChildren(), rid);
//                }
//            }
//        }
//        return list;
//    }
//
//    public void removeList() {
//        list =new ArrayList<>();
//
//    }
}

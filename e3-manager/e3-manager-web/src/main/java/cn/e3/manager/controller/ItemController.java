package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;



@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	/**
	 * 根据id查询商品信息
	 * @param Itemid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/item/id/{itemId}")
	@ResponseBody
	public TbItem findItemById(@PathVariable Long itemId){
		//调用service查询商品信息
		TbItem item = itemService.findItemById(itemId);
		//返回商品对象
		return item;
	}

}

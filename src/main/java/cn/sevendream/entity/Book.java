package cn.sevendream.entity;

import lombok.Data;

/**
 * 图书实体
 */
@Data
public class Book {

	private long bookId;// 图书ID

	private String name;// 图书名称

	private int number;// 馆藏数量

}

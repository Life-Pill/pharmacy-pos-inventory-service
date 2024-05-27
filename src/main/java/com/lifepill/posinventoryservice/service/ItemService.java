package com.lifepill.posinventoryservice.service;

import com.lifepill.posinventoryservice.dto.ApiResponseDTO.SupplierItemApiResponseDTO;
import com.lifepill.posinventoryservice.dto.ItemCategoryDTO;
import com.lifepill.posinventoryservice.dto.paginated.PaginatedResponseItemDTO;
import com.lifepill.posinventoryservice.dto.requestDTO.ItemSaveRequestCategoryDTO;
import com.lifepill.posinventoryservice.dto.requestDTO.ItemSaveRequestDTO;
import com.lifepill.posinventoryservice.dto.requestDTO.ItemUpdateDTO;
import com.lifepill.posinventoryservice.dto.responseDTO.ItemGetAllResponseDTO;
import com.lifepill.posinventoryservice.dto.responseDTO.ItemGetResponseDTO;
import com.lifepill.posinventoryservice.dto.responseDTO.ItemGetResponseWithoutSupplierDetailsDTO;

import java.util.List;

public interface ItemService {

    String saveItems(ItemSaveRequestDTO itemSaveRequestDTO);

    String saveCategory(ItemCategoryDTO categoryDTO);

    List<ItemCategoryDTO> getAllCategories();

    String updateCategoryDetails(long categoryId, ItemCategoryDTO categoryDTO);

    String deleteCategory(long categoryId);

   /* List<ItemGetResponseDTO> getItemByNameAndStatusBymapstruct(String itemName);

    List<ItemGetResponseDTO> getItemByName(String itemName);

    List<ItemGetResponseDTO> getItemByStockStatus(boolean activeStatus);

    String updateItem(ItemUpdateDTO itemUpdateDTO);

    String deleteItem(long itemId);
    List<ItemGetAllResponseDTO> getAllItems();

    PaginatedResponseItemDTO getItemByStockStatusWithPaginateed(boolean activeStatus, int page, int size);

    List<ItemGetResponseDTO> getItemByBarCode(String itemBarCode);

    String saveCategory(ItemCategoryDTO categoryDTO);

    String saveItemWithCategory(ItemSaveRequestCategoryDTO itemSaveRequestCategoryDTO);

    List<ItemCategoryDTO> getAllCategories();

    String updateCategoryDetails(long categoryId, ItemCategoryDTO categoryDTO);

    String deleteCategory(long categoryId);

    ItemGetResponseWithoutSupplierDetailsDTO getItemById(long itemId);

    SupplierItemApiResponseDTO getAllDetailsItemById(long itemId);*/
}

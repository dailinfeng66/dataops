package com.cuit.common.model.base.ops;

import com.cuit.common.model.base.ops.NodeMsg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author dailinfeng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Connection {
    /**
     * 出发点
     */
    private NodeMsg source;
    /**
     * 指向点
     */
    private NodeMsg destination;
}

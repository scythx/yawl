/*
 * Copyright (c) 2004-2011 The YAWL Foundation. All rights reserved.
 * The YAWL Foundation is a collaboration of individuals and
 * organisations who are committed to improving workflow technology.
 *
 * This file is part of YAWL. YAWL is free software: you can
 * redistribute it and/or modify it under the terms of the GNU Lesser
 * General Public License as published by the Free Software Foundation.
 *
 * YAWL is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General
 * Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with YAWL. If not, see <http://www.gnu.org/licenses/>.
 */

package org.yawlfoundation.yawl.cost.data;

import org.yawlfoundation.yawl.util.XNode;

/**
* @author Michael Adams
* @date 14/10/11
*/
public class CostValue {

    double amount;
    String currency;

    public CostValue() { }

    public CostValue(XNode node) { fromXNode(node); }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public XNode toXNode() {
        XNode node = new XNode("costvalue");
        node.addChild("amount", amount);
        node.addChild("currency", currency);
        return node;
    }
    
    public void fromXNode(XNode node) {
        amount = Double.valueOf(node.getChildText("amount"));
        currency = node.getChildText("currency");
    }
}
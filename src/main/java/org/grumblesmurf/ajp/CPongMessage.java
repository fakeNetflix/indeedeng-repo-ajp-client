package org.grumblesmurf.ajp;

import java.io.IOException;

class CPongMessage
    extends AbstractAjpMessage
{
    CPongMessage() throws IOException {
        super(Constants.PACKET_TYPE_CPONG); 
    }
}

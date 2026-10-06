package org.gtlcore.gtlcore.common.data.machines;

import com.gregtechceu.gtceu.api.machine.MultiblockMachineDefinition;

/**
 * Compatibility shim for addons compiled against the pre-split
 * {@code AdvancedMultiBlockMachine} (e.g. GTLAdditions 3.2.x jars). The machine definitions now
 * live in {@link AdvancedMultiBlockMachineA} and {@link AdvancedMultiBlockMachineB}; this class
 * aliases every field so the old binaries keep linking. Class loading semantics match the old
 * single class: touching any alias initializes both split classes.
 */
@Deprecated
@SuppressWarnings("unused")
public class AdvancedMultiBlockMachine {

    private AdvancedMultiBlockMachine() {}

    public static final MultiblockMachineDefinition SIMULATION_MACHINE = AdvancedMultiBlockMachineA.SIMULATION_MACHINE;
    public static final MultiblockMachineDefinition GREENHOUSE = AdvancedMultiBlockMachineA.GREENHOUSE;
    public static final MultiblockMachineDefinition EYE_OF_HARMONY = AdvancedMultiBlockMachineA.EYE_OF_HARMONY;
    public static final MultiblockMachineDefinition SPACE_PROBE_SURFACE_RECEPTION = AdvancedMultiBlockMachineA.SPACE_PROBE_SURFACE_RECEPTION;
    public static final MultiblockMachineDefinition SPACE_COSMIC_PROBE_RECEIVERS = AdvancedMultiBlockMachineA.SPACE_COSMIC_PROBE_RECEIVERS;
    public static final MultiblockMachineDefinition DIMENSIONALLY_TRANSCENDENT_PLASMA_FORGE = AdvancedMultiBlockMachineA.DIMENSIONALLY_TRANSCENDENT_PLASMA_FORGE;
    public static final MultiblockMachineDefinition CIRCUIT_ASSEMBLY_LINE = AdvancedMultiBlockMachineA.CIRCUIT_ASSEMBLY_LINE;
    public static final MultiblockMachineDefinition ASSEMBLER_MODULE = AdvancedMultiBlockMachineA.ASSEMBLER_MODULE;
    public static final MultiblockMachineDefinition RESOURCE_COLLECTION = AdvancedMultiBlockMachineA.RESOURCE_COLLECTION;
    public static final MultiblockMachineDefinition BLOCK_CONVERSION_ROOM = AdvancedMultiBlockMachineA.BLOCK_CONVERSION_ROOM;
    public static final MultiblockMachineDefinition LARGE_BLOCK_CONVERSION_ROOM = AdvancedMultiBlockMachineA.LARGE_BLOCK_CONVERSION_ROOM;
    public static final MultiblockMachineDefinition PCB_FACTORY = AdvancedMultiBlockMachineA.PCB_FACTORY;
    public static final MultiblockMachineDefinition BLAZE_BLAST_FURNACE = AdvancedMultiBlockMachineA.BLAZE_BLAST_FURNACE;
    public static final MultiblockMachineDefinition COLD_ICE_FREEZER = AdvancedMultiBlockMachineA.COLD_ICE_FREEZER;
    public static final MultiblockMachineDefinition DOOR_OF_CREATE = AdvancedMultiBlockMachineA.DOOR_OF_CREATE;
    public static final MultiblockMachineDefinition BEDROCK_DRILLING_RIG = AdvancedMultiBlockMachineA.BEDROCK_DRILLING_RIG;
    public static final MultiblockMachineDefinition CREATE_AGGREGATION = AdvancedMultiBlockMachineA.CREATE_AGGREGATION;
    public static final MultiblockMachineDefinition SUPRACHRONAL_ASSEMBLY_LINE_MODULE = AdvancedMultiBlockMachineA.SUPRACHRONAL_ASSEMBLY_LINE_MODULE;
    public static final MultiblockMachineDefinition SUPRACHRONAL_ASSEMBLY_LINE = AdvancedMultiBlockMachineA.SUPRACHRONAL_ASSEMBLY_LINE;

    public static final MultiblockMachineDefinition PROCESSING_PLANT = AdvancedMultiBlockMachineB.PROCESSING_PLANT;
    public static final MultiblockMachineDefinition ASSEMBLE_PLANT = AdvancedMultiBlockMachineB.ASSEMBLE_PLANT;
    public static final MultiblockMachineDefinition SEPARATED_PLANT = AdvancedMultiBlockMachineB.SEPARATED_PLANT;
    public static final MultiblockMachineDefinition MIXED_PLANT = AdvancedMultiBlockMachineB.MIXED_PLANT;
    public static final MultiblockMachineDefinition WEATHER_CONTROL = AdvancedMultiBlockMachineB.WEATHER_CONTROL;
    public static final MultiblockMachineDefinition NANO_FORGE_1 = AdvancedMultiBlockMachineB.NANO_FORGE_1;
    public static final MultiblockMachineDefinition NANO_FORGE_2 = AdvancedMultiBlockMachineB.NANO_FORGE_2;
    public static final MultiblockMachineDefinition NANO_FORGE_3 = AdvancedMultiBlockMachineB.NANO_FORGE_3;
    public static final MultiblockMachineDefinition ISA_MILL = AdvancedMultiBlockMachineB.ISA_MILL;
    public static final MultiblockMachineDefinition HEAT_EXCHANGER = AdvancedMultiBlockMachineB.HEAT_EXCHANGER;
    public static final MultiblockMachineDefinition ADVANCED_ASSEMBLY_LINE = AdvancedMultiBlockMachineB.ADVANCED_ASSEMBLY_LINE;
    public static final MultiblockMachineDefinition FISSION_REACTOR = AdvancedMultiBlockMachineB.FISSION_REACTOR;
    public static final MultiblockMachineDefinition SPACE_ELEVATOR = AdvancedMultiBlockMachineB.SPACE_ELEVATOR;
    public static final MultiblockMachineDefinition SLAUGHTERHOUSE = AdvancedMultiBlockMachineB.SLAUGHTERHOUSE;
    public static final MultiblockMachineDefinition SUPER_COMPUTATION = AdvancedMultiBlockMachineB.SUPER_COMPUTATION;
    public static final MultiblockMachineDefinition CREATE_COMPUTATION = AdvancedMultiBlockMachineB.CREATE_COMPUTATION;
    public static final MultiblockMachineDefinition ADVANCED_INFINITE_DRILLER = AdvancedMultiBlockMachineB.ADVANCED_INFINITE_DRILLER;
    public static final MultiblockMachineDefinition NEUTRON_ACTIVATOR = AdvancedMultiBlockMachineB.NEUTRON_ACTIVATOR;
    public static final MultiblockMachineDefinition[] FLUID_DRILLING_RIG = AdvancedMultiBlockMachineB.FLUID_DRILLING_RIG;
    public static final MultiblockMachineDefinition[] FUSION_REACTOR = AdvancedMultiBlockMachineB.FUSION_REACTOR;
    public static final MultiblockMachineDefinition[] COMPRESSED_FUSION_REACTOR = AdvancedMultiBlockMachineB.COMPRESSED_FUSION_REACTOR;
}
